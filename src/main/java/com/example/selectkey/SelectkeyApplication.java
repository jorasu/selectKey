package com.example.selectkey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.selectkey.dao")
public class SelectkeyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelectkeyApplication.class, args);
    }

}
