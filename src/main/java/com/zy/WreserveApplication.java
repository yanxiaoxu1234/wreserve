package com.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zy.wreserve.mapper")
public class WreserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(WreserveApplication.class, args);
        }
        }
