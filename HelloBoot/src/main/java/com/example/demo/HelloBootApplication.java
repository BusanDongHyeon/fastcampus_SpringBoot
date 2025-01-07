package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@(애노테이션) - 메타데이터, 전처리
@SpringBootApplication // MVC관련 API - FrontController, HandlerMapping, ViewResolver,POJO, Repository,Service
//@SpringBootConfiguration
//@EnableAutoConfiguration >>Spring Web MVC와 관련된 클래스를 자동으로 구성하게 해준다.
//@ComponentScan >> @Controller, @Repository, @Service >> 서버가 시작되면 어노테이션 붙어있는것들을 스캔한다.
public class HelloBootApplication {
	//여기서부터 프로그램이 동작
	public static void main(String[] args) {
		SpringApplication.run(HelloBootApplication.class, args);
	}

}
