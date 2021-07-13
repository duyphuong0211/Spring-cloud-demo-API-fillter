package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @GetMapping("/message/request")
    public String test(@RequestHeader("second-request") String header){

        System.out.println(header);
        return "Hello DP Called in Second Service";
    }

    @GetMapping("/message/response")
    public String test2(@RequestHeader("second-response") String header){

        System.out.println(header);
        return "Hello DP Called in Second Service and ";
    }

}
