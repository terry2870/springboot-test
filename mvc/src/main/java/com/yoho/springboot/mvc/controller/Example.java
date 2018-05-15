/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoho.springboot.dal.ITestTableDAO;
import com.yoho.springboot.dal.model.TestTable;
import com.yoho.springboot.mvc.service.TestService;

/**
 * @author ping.huang 2017年8月28日
 */
@RestController
public class Example {

	@Autowired
	private TestService testService;
	@Autowired
	private ITestTableDAO testTableDAO;
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		TestTable test = testTableDAO.selectByPrimaryKey(1);
		System.out.println("test1= " + test.toString());
		
		test = testTableDAO.selectOne(1);
		System.out.println("test2= " + test.toString());
		
		return testService.test(myName);
	}
}
