package pl.edu.agh.iet.dts.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author Bartłomiej Grochal
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class TracingService {

    public static void main(String[] args) {
        SpringApplication.run(TracingService.class, args);
    }

}
