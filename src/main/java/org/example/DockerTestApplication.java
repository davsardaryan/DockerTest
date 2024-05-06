package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@Configuration
public class DockerTestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DockerTestApplication.class, args);
    }
}
