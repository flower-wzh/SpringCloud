package com.wzh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "TestCloud")
public interface TestClientService {

    @GetMapping("/test/test/{name}")
    public String test(@PathVariable("name") String name);
}
