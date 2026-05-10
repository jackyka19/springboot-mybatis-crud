package com.example.mydemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mydemo2.mapper")
public class Mydemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Mydemo2Application.class, args);
    }

}
