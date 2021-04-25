package com.lshsd.appinfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.lshsd.appinfo.mapper.*")
public class AppinfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppinfoApplication.class, args);
    }

}
