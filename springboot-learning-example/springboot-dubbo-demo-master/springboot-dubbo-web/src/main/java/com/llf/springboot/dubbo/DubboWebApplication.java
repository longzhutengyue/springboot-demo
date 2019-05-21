package com.llf.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Lee on 2016/10/13.
 */
@SpringBootApplication
//@ImportResource("classpath:consumer.xml")
public class DubboWebApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DubboWebApplication.class, args);
    }
}
