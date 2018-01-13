# Devices Tracking System - Tracing Service
The Tracing Service collects and visualizes data regarding attributes (timestamps in particular) of HTTP requests 
passing between microservices composing the application.

## Prerequisites
You need to have the following tools installed and configured:
  - Java SE 1.8+
  - Maven 3.0+

## Installation and Commissioning
In order to run the tracing service, follow these steps:
  1. Run the [Configuration Server](https://github.com/device-tracking-system/configuration-server).
  2. Run the [Service Discovery](https://github.com/device-tracking-system/service-discovery).
  3. Clone the latest production version of this repository from the `master` branch.
  4. Navigate to the cloned repository and install all dependencies by typing:
```
mvn install
``` 
  7. Run the built `*.jar` file passing the location of configuration files by typing:
```
java -jar target/tracing-service-1.0-SNAPSHOT.jar --spring.config.location=classpath:pl/edu/agh/iet/dts/tracing/
```
The monitoring dashboard is running on `http://localhost:9091`. This tool reports all time- and latency-related issues
derived from network (HTTP-based) communication between microservices building up the whole infrastructure of the 
Devices Tracking System. This dashboard is provided by the Zipkin, while monitoring data are uploaded by the services
using Spring Cloud Sleuth library. 

## Building the Docker image
When the `*.jar` file is successfully built, a Docker image for the production environment may be created by applying
following steps:
  1. Enter the root directory of this repository.
  2. Build the Docker image by typing:
```
docker build . -t tracing-service
```
  3. In order to run the image, type:
```
docker run -p 9091:9091 -e CONFIGURATION_SERVER_IP=[CONFIGURATION SERVER HOST IP ADDRESS] -e EUREKA_IP=[EUREKA HOST IP ADDRESS] -t tracing-service
```
