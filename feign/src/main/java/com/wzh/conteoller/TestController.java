package com.wzh.conteoller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wzh.service.TestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestClientService testClientService;

    @RequestMapping("/test/{name}")
    //@HystrixCommand(fallbackMethod = "sss")
    public String test(@PathVariable("name") String name) {
        return testClientService.test(name);
    }
}
