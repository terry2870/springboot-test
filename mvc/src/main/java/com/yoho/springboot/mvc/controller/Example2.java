/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.core.common.exceptions.CommonException;
import com.yoho.springboot.dal.ITestTableDAO;
import com.yoho.springboot.dal.TblLoginLogDAO;
import com.yoho.springboot.dal.model.TblLoginLog;
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
	private TblLoginLogDAO tblLoginLogDAO;
	@Value("${redis.proxy.port}")
	private int port;

	
	@RequestMapping("/home")
	public String home(String str, HttpServletRequest request) {
		log.info("enter home with str={}", str);
		log.info("enter home with port={}", port);
		if (true) {
			throw new CommonException(201, "异常了");
		}
		
		
		request.setAttribute("str1", "扎实打发斯蒂芬");
		
		TestTable table = new TestTable();
		table.setTestName("testname2");
		testTableDAO.deleteByParams(table);
		
		
		return "1";
	}

	@RequestMapping("/hello/{myName}")
	@ResponseBody
	public String index(@PathVariable String myName) {
		
		SQL sql = new SQL()
				.SELECT("*")
				.FROM("tbl_login_log")
				.WHERE("uid=100", "create_time>0");
		List<TblLoginLog> list = tblLoginLogDAO.selectList(sql);
		
		log.info("allCount={}", list);
		
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
	
	@RequestMapping("/jsp/{myName}")
	public String jsp(@PathVariable String myName, HttpServletRequest request) {
		log.info("entre 888888");
		List<TestTable> testList = testTableDAO.selectListByParams(null);
		request.setAttribute("name", myName);
		request.setAttribute("sex", 0);
		request.setAttribute("str", "奥术大师多");
		request.setAttribute("testList", testList);
		return "1";
	}
}
