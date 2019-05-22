/**
 * 
 */
package com.yoho.springboot.mvc.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author huangping
 * 2018年11月21日
 */
public interface IESFreshInfoDAO extends ElasticsearchRepository<ESFreshInfo, Integer> {

	
}
