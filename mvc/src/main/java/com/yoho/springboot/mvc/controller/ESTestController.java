/**
 * 
 */
package com.yoho.springboot.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.common.geo.GeoDistance;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.GeoDistanceQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.GeoDistanceSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.AliasQuery;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.UpdateQuery;
import org.springframework.data.elasticsearch.core.query.UpdateQueryBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.core.common.beans.Response;
import com.hp.core.common.utils.DateUtil;
import com.yoho.springboot.mvc.es.ESFreshInfo;
import com.yoho.springboot.mvc.es.IESFreshInfoDAO;
import com.yoho.springboot.mvc.es.StoreInfoResponse;

/**
 * @author huangping
 * Mar 12, 2019
 */
@RestController
@RequestMapping("/es")
public class ESTestController {
	
	private static Logger log = LoggerFactory.getLogger(ESTestController.class);

	@Autowired
	private IESFreshInfoDAO eSFreshInfoDAO;
	
	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;
	
	@RequestMapping("/delInfo")
	public Response<ESFreshInfo> delInfo(String indexName) {
		elasticsearchTemplate.deleteIndex(indexName);
		return new Response<>();
	}
	
	@RequestMapping("/saveInfo")
	public Response<ESFreshInfo> saveInfo(@RequestBody ESFreshInfo info) {
		if (info.getLatitude() != null && info.getLongitude() != null) {
			info.setLocation(info.getLatitude() + "," + info.getLongitude());
		}
		eSFreshInfoDAO.save(info);
		return new Response<>();
	}
	
	@RequestMapping("/updateInfo")
	public Response<ESFreshInfo> updateInfo(@RequestBody ESFreshInfo info) {
		if (info.getLatitude() != null && info.getLongitude() != null) {
			info.setLocation(info.getLatitude() + "," + info.getLongitude());
		}
		
		UpdateQuery query = new UpdateQueryBuilder()
				.withIndexName("freshinfo_1234")
				.withType("fresh")
				.withId(info.getId().toString())
				.withIndexRequest(new IndexRequest("freshinfo_1234", "fresh", info.getId().toString()))
				.build();
		elasticsearchTemplate.update(query);
		return new Response<>();
	}
	
	@RequestMapping("/essearch")
	public Response<Page<StoreInfoResponse>> essearch(String str, Integer page, String sort) {
		System.out.println(1234);
		
		Pageable p = PageRequest.of(page, 10);
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.multiMatchQuery(str, "storeName", "address"))
				.withPageable(p)
				.withIndices("store_info_index_20190319103311")
				.withTypes("store_info_type")
				.withSort(SortBuilders.fieldSort("id").order(SortOrder.ASC))
				.build();
		//Page<ESFreshInfo> result = eSFreshInfoDAO.search(searchQuery);
		//log.info("result1111={}", result.getContent());
		Page<StoreInfoResponse> result = elasticsearchTemplate.queryForPage(searchQuery, StoreInfoResponse.class);
//		FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
//                .add(QueryBuilders.matchPhraseQuery("contentText", str),
//                        ScoreFunctionBuilders.weightFactorFunction(100))
//                //设置权重分 求和模式
//                .scoreMode("sum")
//                //设置权重分最低分
//                .setMinScore(10);
		
		
		return new Response<>(result);
	}
	
	@RequestMapping("/essearch2")
	public Response<Page<ESFreshInfo>> essearch2(String str, Integer page, Double distance, Double longitude, Double latitude) {
		
		
		GeoDistanceQueryBuilder builder = QueryBuilders.geoDistanceQuery("location")//查询字段
				.point(latitude, longitude)//设置经纬度
				.distance(distance, DistanceUnit.METERS)//设置距离和单位（米）
				.geoDistance(GeoDistance.PLANE)
				;
		
		
		GeoDistanceSortBuilder sortBuilder = SortBuilders.geoDistanceSort("location", latitude, longitude)
				.unit(DistanceUnit.METERS)
				.order(SortOrder.ASC);//排序方式
		
		Pageable p = PageRequest.of(page, 2);
		
		
		
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withFilter(builder)
				.withPageable(p)
				.withSort(sortBuilder)
				.build();
		Page<ESFreshInfo> result = elasticsearchTemplate.queryForPage(searchQuery, ESFreshInfo.class);
		
		return new Response<>(result);
	}
	
	private static String lastIndexName = null;
	
	@RequestMapping("/createIndex")
	public Response<Object> createIndex(String indexName) {
		//创建新的索引
		indexName = indexName + "_index_" + DateUtil.getToday("yyyyMMddHHmmss");
		elasticsearchTemplate.createIndex(indexName);
		
		//插入数据
		List<IndexQuery> queries = new ArrayList<>();
		IndexQuery q = null;
		ESFreshInfo f = null;
		for (int i = 0; i < 10; i++) {
			f = new ESFreshInfo();
			f.setId(i);
			f.setContentText("text哈哈奥术大师多asdasdasdasd_" + i);
			
			q = new IndexQuery();
			//q.setId(String.valueOf(i));
			q.setIndexName(indexName);
			q.setObject(f);
			q.setType("fresh");
			queries.add(q);
		}
		elasticsearchTemplate.bulkIndex(queries);
		
		//解除老的关系
		AliasQuery a = null;
		try {
			a = new AliasQuery();
			a.setIndexName(lastIndexName);
			a.setAliasName("freshinfo");
			elasticsearchTemplate.removeAlias(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//添加新的关系
		a = new AliasQuery();
		a.setIndexName(indexName);
		a.setAliasName("freshinfo");
		elasticsearchTemplate.addAlias(a);
		
		lastIndexName = indexName;
		
		return new Response<>();
	}

}
