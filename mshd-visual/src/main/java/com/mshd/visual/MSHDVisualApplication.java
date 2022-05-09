package com.mshd.visual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MSHDVisualApplication {
    public static void main(String[] args) {
        SpringApplication.run(MSHDVisualApplication.class, args);
        System.out.println("可视化服务启动");
    }
}