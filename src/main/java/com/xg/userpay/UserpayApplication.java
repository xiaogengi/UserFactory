package com.xg.userpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xg"})
public class UserpayApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserpayApplication.class, args);
    }

}
