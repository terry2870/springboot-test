/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.core.common.beans.Response;
import com.yoho.springboot.dal.IBillInfoDAO;
import com.yoho.springboot.dal.ITestTableDAO;
import com.yoho.springboot.dal.model.BillInfo;
import com.yoho.springboot.dal.model.TestTable;

/**
 * @author ping.huang 2017年8月28日
 */
@RestController
public class Example {

	private static Logger log = LoggerFactory.getLogger(Example.class);
	
	@Autowired
	private ITestTableDAO testTableDAO;
	@Autowired
	private IBillInfoDAO billInfoDAO;
	@Autowired
	private TestAAA t;
	

	@RequestMapping("/select1/{id}")
	public Response<TestTable> select1(@PathVariable Integer id) {
		TestTable test = testTableDAO.selectByPrimaryKey(id);
		return new Response<>(test);
	}
	
	@RequestMapping("/select2/{id}")
	public Response<BillInfo> select2(@PathVariable Integer id) {
		BillInfo bill = billInfoDAO.selectByPrimaryKey(id);
		return new Response<>(bill);
	}
	
	@RequestMapping("/insertTest")
	public Response<Object> insertTest() {
		TestTable test = new TestTable();
		long time = System.currentTimeMillis();
		test.setSimplified("simplified_" + time);
		test.setTestName("testName_" + time);
		test.setTitle("title_" + time);
		testTableDAO.insertTest(test);
		System.out.println(test.getId());
		return new Response<>(test);
	}
	
	@RequestMapping("/insert2")
	public Response<Object> insert2() {
		TestTable test = new TestTable();
		long time = System.currentTimeMillis();
		test.setSimplified("simplified_" + time);
		test.setTestName("testName_" + time);
		test.setTitle("title_" + time);
		testTableDAO.insert2(test);
		System.out.println(test.getId());
		return new Response<>(test);
	}
	
	@RequestMapping("/update")
	public Response<Object> update() {
		TestTable test = new TestTable();
		test.setId(1);
		test.setTitle("title");
		test.setSimplified("Simplified");
		test.setTestName("哈哈1234");
		testTableDAO.updateByPrimaryKey(test);
		return new Response<>();
	}
}
