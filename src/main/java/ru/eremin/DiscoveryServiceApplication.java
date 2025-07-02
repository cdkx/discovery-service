package ru.eremin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

import java.util.Date;


@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiscoveryServiceApplication.class, args);
        log.info("app DiscoveryService started on {}", new Date(context.getStartupDate()));
    }

}
