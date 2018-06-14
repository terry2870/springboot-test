/**
 * 
 */
package com.yoho.springboot.dal.model;

import javax.persistence.Id;

import com.hp.core.common.beans.BaseBean;

/**
 * @author huangping
 * 2018年1月29日
 */
public class TestTable extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3206214461546085194L;

	@Id
	private Integer id;
	private String simplified;
	private String title;
	private String testName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSimplified() {
		return simplified;
	}
	public void setSimplified(String simplified) {
		this.simplified = simplified;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
}
