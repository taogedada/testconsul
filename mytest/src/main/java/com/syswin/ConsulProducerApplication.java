package com.syswin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.syswin")
public class ConsulProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProducerApplication.class, args);
    }

}
