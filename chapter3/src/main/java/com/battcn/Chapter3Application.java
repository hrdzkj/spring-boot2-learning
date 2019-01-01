package com.battcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Levin
 * 为了提高响应速度，默认情况下会缓存模板。如果是在开发中请将spring.thymeleaf.cache 属性设置成 false
 */
@SpringBootApplication
public class Chapter3Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter3Application.class, args);
    }

}
