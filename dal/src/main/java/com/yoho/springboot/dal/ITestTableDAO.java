/**
 * 
 */
package com.yoho.springboot.dal;
/**
 * @author huangping
 * 2018年1月29日
 */

import com.hp.core.mybatis.mapper.BaseMapper;
import com.yoho.springboot.dal.model.TestTable;

public interface ITestTableDAO extends BaseMapper<TestTable> {

	
	public TestTable selectOne(Integer id);
	
	public Integer insertTest(TestTable table);
	public Integer insert2(TestTable table);
}
