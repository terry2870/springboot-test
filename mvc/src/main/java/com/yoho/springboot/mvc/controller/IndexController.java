/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangping
 * 2018年7月30日
 */
@Controller
@RequestMapping("/IndexController")
public class IndexController {

	@RequestMapping("/index")
	public String handleRequest(String jumpUrl, HttpServletRequest request) {
		//request.setAttribute("", arg1);
		return "index";
	}
}
