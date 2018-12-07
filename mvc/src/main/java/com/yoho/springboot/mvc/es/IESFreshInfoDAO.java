/**
 * 
 */
package com.yoho.springboot.mvc.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author huangping
 * 2018年11月21日
 */
@Repository
public interface IESFreshInfoDAO extends ElasticsearchRepository<ESFreshInfo, Integer> {

}
