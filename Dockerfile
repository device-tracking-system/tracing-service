FROM openjdk:8-jre-slim
LABEL name="tracing-service" \
      author="bgrochal" \
      organization="device-tracking-system"

ADD target/tracing-service-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.config.location=classpath:pl/edu/agh/iet/dts/tracing/", "--spring.profiles.active=production"]
