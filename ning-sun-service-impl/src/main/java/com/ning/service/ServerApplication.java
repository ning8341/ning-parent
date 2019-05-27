package com.ning.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/5/27 16:38
 * @Version: ning-parentV1.0
 */
@MapperScan(basePackages = {"com.ning.dao"})
@ComponentScan(basePackages = {"com.ning.service.impl"})
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ServerApplication.class);
        springApplication.run(args);
    }
}
