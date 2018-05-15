/**
 * 
 */
package com.yoho.springboot.dal;
/**
 * @author huangping
 * 2018年1月29日
 */

import com.gitee.hengboy.mybatis.enhance.mapper.EnhanceMapper;
import com.yoho.springboot.dal.model.TestTable;

public interface ITestTableDAO extends EnhanceMapper<TestTable, Integer> {

	public TestTable selectByPrimaryKey(Integer id);
}
