/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.collect.Lists;
import com.yoho.springboot.dal.ITestTableDAO;
import com.yoho.springboot.dal.model.TestTable;

/**
 * @author ping.huang 2017年8月28日
 */
@Controller
@RequestMapping("/Example2")
public class Example2 {

	static Logger log = LoggerFactory.getLogger(Example2.class);
	@Autowired
	private ITestTableDAO testTableDAO;
	@Autowired
	private TestAAA t;
	
	@Value("${spring.freemarker.template-loader-path}")
	String path;
	
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
	
	@RequestMapping("/ftl/{myName}")
	public String ftl(@PathVariable String myName, HttpServletRequest request) {
		List<TestTable> testList = testTableDAO.selectListByParams(null);
		request.setAttribute("name", myName);
		request.setAttribute("sex", 0);
		request.setAttribute("testList", testList);
		return "123";
	}
}
