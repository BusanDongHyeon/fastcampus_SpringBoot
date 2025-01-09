package com.example.demo.service;

import com.example.demo.entity.Member;
import com.example.demo.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    public HomeServiceImpl() {
        System.out.println("HomeServiceImpl()"); //HomeServiceImpl 객체가 생성이 된다.
    }

    @Autowired
    private HomeRepository homeRepository; //DI

    @Override
    public List<Member> memberList() {
        return homeRepository.findAll();
    }
}
