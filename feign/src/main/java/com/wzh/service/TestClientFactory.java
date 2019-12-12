package com.wzh.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TestClientFactory implements FallbackFactory<TestClientService> {
    @Override
    public TestClientService create(Throwable throwable) {
        return new TestClientService() {
            @Override
            public String test(String name) {
                return "name!!!Error--->" + name;
            }
        };
    }
}
