package com.cbd.steken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StekenApplication {

    public static void main(String[] args) {
        SpringApplication.run(StekenApplication.class, args);
    }

}
