package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig { //실제 객체가 생성되어 버림. @Configuration이 있으면 자동으로 해석해서 객체를 메모리에 만들어 준다.

    public  TestConfig(){
        System.out.println("TestConfig");
    }
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
