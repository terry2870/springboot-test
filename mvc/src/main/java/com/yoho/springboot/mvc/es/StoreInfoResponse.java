package com.yoho.springboot.mvc.es;

import org.elasticsearch.common.geo.GeoPoint;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import com.hp.core.common.beans.BaseBean;

/**
 * 店铺信息
 * @author huangping
 * Mar 14, 2019
 */
@Document(indexName = "aa_1234", type = "abc")
public class StoreInfoResponse extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4011134617356106789L;

	private Integer id;
	
	/**
	 * 店铺中文名
	 */
	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String storeName;

	/**
	 * 店铺英文名
	 */
	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String storeEnglishName;

	/**
	 * 店铺副标题
	 */
	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String storeSubTitle;

	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String storeNameTc;
	
	/**
	 * 经纬度
	 */
	@GeoPointField
	private GeoPoint point;
	
	/**
	 * 店铺描述
	 */
	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String description;

	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String descriptionTc;

	/**
	 * 评分
	 */
	private Integer score;

	/**
	 * 人均消费
	 */
	private Integer consumption;

	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String address;

	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String addressTc;

	@Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
	private String addressFull;

	private Integer orderBy;

	private Integer createTime;

	private Integer updateTime;

	private Integer isRecommend;

	private Integer recommendTime;

	private Integer sort;

	/**
	 * 推荐到首页时间（为0，则没有）
	 */
	private Integer indexTime;
	
	/**
	 * 店铺来源
	 */
	private Integer storeSource;
	
	/**
	 * 是否mars店铺
	 */
	private Integer isMarsStore;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreEnglishName() {
		return storeEnglishName;
	}

	public void setStoreEnglishName(String storeEnglishName) {
		this.storeEnglishName = storeEnglishName;
	}

	public String getStoreSubTitle() {
		return storeSubTitle;
	}

	public void setStoreSubTitle(String storeSubTitle) {
		this.storeSubTitle = storeSubTitle;
	}

	public String getStoreNameTc() {
		return storeNameTc;
	}

	public void setStoreNameTc(String storeNameTc) {
		this.storeNameTc = storeNameTc;
	}

	public GeoPoint getPoint() {
		return point;
	}

	public void setPoint(GeoPoint point) {
		this.point = point;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionTc() {
		return descriptionTc;
	}

	public void setDescriptionTc(String descriptionTc) {
		this.descriptionTc = descriptionTc;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getConsumption() {
		return consumption;
	}

	public void setConsumption(Integer consumption) {
		this.consumption = consumption;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressTc() {
		return addressTc;
	}

	public void setAddressTc(String addressTc) {
		this.addressTc = addressTc;
	}

	public String getAddressFull() {
		return addressFull;
	}

	public void setAddressFull(String addressFull) {
		this.addressFull = addressFull;
	}

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getRecommendTime() {
		return recommendTime;
	}

	public void setRecommendTime(Integer recommendTime) {
		this.recommendTime = recommendTime;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIndexTime() {
		return indexTime;
	}

	public void setIndexTime(Integer indexTime) {
		this.indexTime = indexTime;
	}

	public Integer getStoreSource() {
		return storeSource;
	}

	public void setStoreSource(Integer storeSource) {
		this.storeSource = storeSource;
	}

	public Integer getIsMarsStore() {
		return isMarsStore;
	}

	public void setIsMarsStore(Integer isMarsStore) {
		this.isMarsStore = isMarsStore;
	}

	
}