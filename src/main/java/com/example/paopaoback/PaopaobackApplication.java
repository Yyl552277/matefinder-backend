package com.example.paopaoback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.example.paopaoback.mapper")
@SpringBootApplication
@EnableScheduling
public class PaopaobackApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaopaobackApplication.class, args);
    }

}
