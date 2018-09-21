package com.dusk.getsomething.controller;

import com.dusk.getsomething.config.Config;
import com.dusk.getsomething.config.Myconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @Autowired
    private Config config;

    @Autowired
    private Myconfig myconfig;

    @ResponseBody
    @GetMapping(value = "/test")
    public String demo(){
        System.out.println(config.getList().size());
        for (String str:
             config.getList()) {
            System.out.println(str);
        }
        System.out.println(myconfig.getName());
        System.out.println(myconfig.getUserName());
        return  "Hello";
    }
}
