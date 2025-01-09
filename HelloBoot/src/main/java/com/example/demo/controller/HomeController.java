package com.example.demo.controller;

import com.example.demo.entity.Member;
import com.example.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {



    @Autowired
    private HomeService homeService;
    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/memberList")
    public String memberList(Model model) {
        List<Member> memList = homeService.memberList();
        model.addAttribute("memList",memList);
        return "memberList"; //view page(memberList.html)
    }
}
