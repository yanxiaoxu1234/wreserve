package com.zy.wreserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WreserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(WreserveApplication.class, args);
        }
    }
