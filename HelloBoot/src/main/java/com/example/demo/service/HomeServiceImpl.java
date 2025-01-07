package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    public HomeServiceImpl() {
        System.out.println("HomeServiceImpl()"); //HomeServiceImpl 객체가 생성이 된다.
    }
}
