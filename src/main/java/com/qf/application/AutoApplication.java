package com.qf.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ChenJie
 * @date 2020-06-18 15:28:15
 * 功能说明
 */
@SpringBootApplication(scanBasePackages = "com.qf")
public class AutoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoApplication.class,args);
    }
}
