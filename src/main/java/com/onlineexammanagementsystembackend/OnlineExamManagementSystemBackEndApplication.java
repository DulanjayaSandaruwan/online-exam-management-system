package com.onlineexammanagementsystembackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class OnlineExamManagementSystemBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineExamManagementSystemBackEndApplication.class, args);
    }
}
