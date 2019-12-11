package com.wzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/test")
public class TestController {

    private static final String URL_PREFIX = "http://TestCloud";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test/{name}")
    public String test(@PathVariable("name") String name) {
        return restTemplate.getForObject(URL_PREFIX+"/test/test/"+name,String.class);
    }
}
