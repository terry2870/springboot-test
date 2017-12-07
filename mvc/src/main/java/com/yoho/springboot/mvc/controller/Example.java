/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoho.springboot.mvc.service.TestService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ping.huang 2017年8月28日
 */
@RestController
public class Example {

	@Autowired
	TestService testService;
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		return testService.test(myName);
	}
}
