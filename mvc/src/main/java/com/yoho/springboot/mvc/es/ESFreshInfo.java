/**
 * 
 */
package com.yoho.springboot.mvc.es;

import java.math.BigDecimal;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import com.hp.core.common.beans.BaseBean;

/**
 * @author huangping
 * 2018年11月21日
 */
//@Document(indexName = "freshinfo_#{@indexName}", type = "fresh")
@Document(indexName = "freshinfo_1234", type = "fresh111")
public class ESFreshInfo extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7204918383813446393L;
	
	private Integer id;

	/**
	 * 用户uid
	 */
	private Integer uid;

	/**
	 * 隐身状态下，昵称
	 */
	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String nickName;

	/**
	 * 新鲜事文字内容
	 */
	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String contentText;
	
	/**
	 * 经度
	 */
	private BigDecimal longitude;

	/**
	 * 维度
	 */
	private BigDecimal latitude;
	
	@GeoPointField
	private String location;
	
	private Double distance;
	
	private Double geo_distance;
	
	private Double geoDistance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getContentText() {
		return contentText;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getGeo_distance() {
		return geo_distance;
	}

	public void setGeo_distance(Double geo_distance) {
		this.geo_distance = geo_distance;
	}

	public Double getGeoDistance() {
		return geoDistance;
	}

	public void setGeoDistance(Double geoDistance) {
		this.geoDistance = geoDistance;
	}

	
}
