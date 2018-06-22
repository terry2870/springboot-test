/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import org.springframework.stereotype.Service;

/**
 * @author huangping
 * 2018年6月19日
 */
@Service
public class TestAAA {

	private TestAAA() {}
	
	private static TestAAA instance = new TestAAA();
	
	public static TestAAA getInstance() {
		return instance;
	}
	
}
