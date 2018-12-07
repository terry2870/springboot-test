/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.SimpleField;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.core.common.beans.Response;
import com.hp.core.common.utils.DateUtil;
import com.yoho.springboot.dal.TblLoginLogDAO;
import com.yoho.springboot.dal.model.TblLoginLog;
import com.yoho.springboot.mvc.es.ESFreshInfo;
import com.yoho.springboot.mvc.es.IESFreshInfoDAO;

/**
 * @author huangping
 * 2018年6月19日
 */
@RestController
@RequestMapping("/test")
public class TestController {
	
	private static Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TblLoginLogDAO tblLoginLogDAO;
	@Autowired
	private IESFreshInfoDAO eSFreshInfoDAO;
	
	@RequestMapping("/test")
	public Response<String> test(String str) {
		
		TblLoginLog loginLog = tblLoginLogDAO.selectByPrimaryKey(1);
		log.info("loginLog={}", loginLog);
		
		return new Response<>(str);
	}
	
	@RequestMapping("/saveInfo")
	public Response<ESFreshInfo> saveInfo(String str) {
		
		ESFreshInfo es = null;
		for (int i = 0; i < 100; i++) {
			es = new ESFreshInfo();
			es.setId(i + 1);
			es.setContentText(str + "_" + i);
			es.setSendTime(DateUtil.getCurrentTimeSeconds());
			eSFreshInfoDAO.save(es);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		//eSFreshInfoDAO.refresh();
		
		return new Response<>();
	}
	
	@RequestMapping("/essearch")
	public Response<Page<ESFreshInfo>> essearch(String str, Integer page, String sort) {
		
		Pageable p = PageRequest.of(page, 10, Sort.by(Direction.DESC, StringUtils.isEmpty(sort) ? "sendTime" : sort));
		
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.termsQuery("contentText", str))
				.withPageable(p)
				.build();
		Page<ESFreshInfo> result = eSFreshInfoDAO.search(searchQuery);
		
		log.info("result={}", result);
		
		return new Response<>(result);
	}
	
}
