package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Roger Diller on 2/1/16.
 */

@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String sayHello(){
        return "Hello! Spring Boot is awesome!";
    }
}
