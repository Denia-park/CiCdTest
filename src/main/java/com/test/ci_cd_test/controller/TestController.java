package com.test.ci_cd_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test.url}")
    private String OPENVIDU_URL;

    @Value("${openvidu.secret}")
    private String OPENVIDU_Secret;

    @GetMapping("/")
    public String test(){
        return "Hello, Test -- " + OPENVIDU_URL +" !! "+ OPENVIDU_Secret;
    }
}
