package com.catalina.infectious;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfectiousApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfectiousApplication.class, args);
    }

}
