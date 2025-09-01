package com.tattooservice.service.exe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.tattooservice.ms.api", "com.tattooservice.persistence.repository", "com.tattooservice.resources", "com.tattooservice"})
@EnableJpaRepositories(basePackages = "com.tattooservice.persistence.repository")
@EntityScan(basePackages = "com.tattooservice.persistence.dto")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}