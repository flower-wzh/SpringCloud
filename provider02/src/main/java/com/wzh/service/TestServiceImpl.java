package com.wzh.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test(String name) {
        return "Client2的name: "+name;
    }
}
