/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ping.huang 2017年8月28日
 */
@Controller
@RequestMapping("/Example2")
public class Example2 {

	static Logger log = LoggerFactory.getLogger(Example2.class);
	
	@RequestMapping("/home")
	public String home(String str, HttpServletRequest request) {
		log.info("enter home with str={}", str);
		request.setAttribute("str1", "扎实打发斯蒂芬");
		return "1";
	}

	@RequestMapping("/hello/{myName}")
	public String index(@PathVariable String myName) {
		return "Hello " + myName + "!!!";
	}
}
