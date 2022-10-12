package com.zhanshen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenzhh
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.zhanshen"})
public class AppUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppUserApplication.class,args);
    }
}
