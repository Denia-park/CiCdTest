package com.test.ci_cd_test.controller;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;
    @Value("${test.url}")
    private String OPENVIDU_URL;

    private final AmazonS3 amazonS3;

    @GetMapping("/")
    public String test(){
        String imgUrl = amazonS3.getUrl(bucket, "123456").toString();
        return "Hello, Test -- Finish  " + OPENVIDU_URL + "      \n"
                + imgUrl;
    }
}
