package com.springcloud.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by lenovo on 2017/1/24.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class JdbcServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(JdbcServiceApplication.class).web(true).run(args);
    }
}
