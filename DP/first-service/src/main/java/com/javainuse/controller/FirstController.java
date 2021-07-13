package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

	@GetMapping("/message/request")
	public String test(@RequestHeader("first-request") String header){

		System.out.println(header);
		return "Hello DP Called in first Service";
	}

	@GetMapping("/message/response")
	public String test2(@RequestHeader("first-response") String header){

		System.out.println(header);
		return "Hello DP Called in first Service and ";
	}
}

