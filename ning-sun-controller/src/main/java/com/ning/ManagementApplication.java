package com.ning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/5/27 17:59
 * @Version: ning-parentV1.0
 */
@SpringBootApplication
public class ManagementApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ManagementApplication.class);
        springApplication.run(args);
    }
}
