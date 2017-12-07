/**
 * 
 */
package com.yoho.springboot.mvc.service.impl;

import org.springframework.stereotype.Service;

import com.yoho.springboot.mvc.service.TestService;

/**
 * @author ping.huang
 * 2017年10月20日
 */
@Service
public class TestServiceImpl implements TestService {


	@Override
	public String test(String str) {
		return str;
	}

}
