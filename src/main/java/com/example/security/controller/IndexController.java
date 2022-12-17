package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //view 를 리턴하겠다.
public class IndexController {

    @GetMapping({"","/"})
    public String index(){
        //머스테 기본 폴더 src/main/resources
        //뷰리졸버 설정(기본설정) : templates (prefix), .mustache(suffix) 생략가능
        return "index";
    }
}
