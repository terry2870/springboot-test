/**
 * 
 */
package com.yoho.springboot.dal;
/**
 * @author huangping
 * 2018年1月29日
 */

import com.yoho.springboot.dal.model.TestTable;

public interface ITestTableDAO {

	public TestTable selectByPrimaryKey(Integer id);
}
