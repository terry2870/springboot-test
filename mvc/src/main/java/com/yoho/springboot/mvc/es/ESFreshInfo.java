/**
 * 
 */
package com.yoho.springboot.mvc.es;

import java.math.BigDecimal;

import org.springframework.data.elasticsearch.annotations.Document;

import com.hp.core.common.beans.BaseBean;

/**
 * @author huangping
 * 2018年11月21日
 */
@Document(indexName = "freshinfo",type = "employee", shards = 1,replicas = 0, refreshInterval = "-1")
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
	private String nickName;

	/**
	 * 新鲜事文字内容
	 */
	private String contentText;

	/**
	 * 新鲜事图片（json格式[{"url":"xxx","width":100,"height":100}]）
	 */
	private String contentImage;

	/**
	 * 主题id
	 */
	private Integer themeId;

	/**
	 * 城市id
	 */
	private Integer cityId;

	/**
	 * 经度
	 */
	private BigDecimal longitude;

	/**
	 * 维度
	 */
	private BigDecimal latitude;

	/**
	 * 详细地址
	 */
	private String address;

	/**
	 * 是否隐身（0-否；1-是）
	 */
	private Integer isHidden;

	/**
	 * 创建时间
	 */
	private Integer createTime;

	/**
	 * 更新时间
	 */
	private Integer updateTime;

	/**
	 * 审核状态（1-待审核；2-审核通过；3-审核不通过）
	 */
	private Integer checkStatus;

	/**
	 * 状态（1-正常；2-已删除）
	 */
	private Integer status;

	/**
	 * 马甲点赞数
	 */
	private Integer virtualPraiseNum;

	/**
	 * 真实用户点赞数
	 */
	private Integer realPraiseNum;

	/**
	 * 置顶时间
	 */
	private Integer topTime;

	/**
	 * 热度值（排序用）
	 */
	private Integer hotValue;

	/**
	 * 关联店铺评价id
	 */
	private Integer assessmentId;

	/**
	 * 审核人id
	 */
	private Integer checkUserId;

	private Integer hotTime;

	private Integer totalHotValue;
	
	private Integer sendTime;

	private String bgMap;
	
	private Integer realCollectNum;
	
	private Integer virtualCollectNum;

	private String cityName;

	/**
	 * 是否国外，0-否，1-是
	 */
	private Integer isForeign;
	
	/**
	 * 是否发放
	 */
	private Integer isAward;
	
	/**
	 * 举报次数
	 */
	private Integer reportNum;
	
	private Integer operateUserId;
	
	
	/**
	 * 对应店铺id
	 */
	private Integer storeId;
	
	/**
	 * 对店铺的评分
	 */
	private Integer storeScore;
	
	/**
	 * 标签列表(多个用;)
	 */
	private String storeTags;
	
	/**
	 * 发布者类型 1店铺账号 2随机马甲/认证用户
	 */
	private Integer publisherType;
	
	/**
	 * 用户自定义地址
	 */
	private String uAddress;
	
	/**
	 * 自定义地址经度
	 */
	private BigDecimal uLongitude;
	
	/**
	 * 自定义地址纬度
	 */
	private BigDecimal uLatitude;
	
	/**
	 * 用户自定义地址自动获取
	 */
	private String uAutoAddress;
	
	/**
	 * 审核时间
	 */
	private Integer reviewTime;
	
	/**
	 * 人均消费
	 */
	private Integer perConsumption;
	
	/**
	 * 人均消费 单位
	 */
	private String currencyUnit;
	
	/**
	 * 是否合格。0不合格，1合格
	 */
	private Integer isQualified;
	
	/**
	 * 设为精选时间
	 */
	private Integer choiceTime;
	
	/**
	 * 是否热门屏蔽
	 */
	private Integer isHotShield;
	
	/**
	 * 关联的话题专题ID
	 */
	private String topicId;
	
	/**
	 * 是否平均消费屏蔽
	 */
	private Integer isConsumeShield;
	
	/**
	 * 是否自定义评价
	 */
	private Integer isCustom;
	
	/**
	 * 店铺主评价内容
	 */
	private String shopOwnerContent;

	/**
	 * 拔草的新鲜事id
	 */
	private Integer refFreshId;
	
	/**
	 * 种草类型
	 */
	private Integer freshType;
	
	private String storeName;
	
	private String storeIcon;
	
	private String businessAreaName;

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

	public String getContentImage() {
		return contentImage;
	}

	public void setContentImage(String contentImage) {
		this.contentImage = contentImage;
	}

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Integer isHidden) {
		this.isHidden = isHidden;
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

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getVirtualPraiseNum() {
		return virtualPraiseNum;
	}

	public void setVirtualPraiseNum(Integer virtualPraiseNum) {
		this.virtualPraiseNum = virtualPraiseNum;
	}

	public Integer getRealPraiseNum() {
		return realPraiseNum;
	}

	public void setRealPraiseNum(Integer realPraiseNum) {
		this.realPraiseNum = realPraiseNum;
	}

	public Integer getTopTime() {
		return topTime;
	}

	public void setTopTime(Integer topTime) {
		this.topTime = topTime;
	}

	public Integer getHotValue() {
		return hotValue;
	}

	public void setHotValue(Integer hotValue) {
		this.hotValue = hotValue;
	}

	public Integer getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(Integer assessmentId) {
		this.assessmentId = assessmentId;
	}

	public Integer getCheckUserId() {
		return checkUserId;
	}

	public void setCheckUserId(Integer checkUserId) {
		this.checkUserId = checkUserId;
	}

	public Integer getHotTime() {
		return hotTime;
	}

	public void setHotTime(Integer hotTime) {
		this.hotTime = hotTime;
	}

	public Integer getTotalHotValue() {
		return totalHotValue;
	}

	public void setTotalHotValue(Integer totalHotValue) {
		this.totalHotValue = totalHotValue;
	}

	public Integer getSendTime() {
		return sendTime;
	}

	public void setSendTime(Integer sendTime) {
		this.sendTime = sendTime;
	}

	public String getBgMap() {
		return bgMap;
	}

	public void setBgMap(String bgMap) {
		this.bgMap = bgMap;
	}

	public Integer getRealCollectNum() {
		return realCollectNum;
	}

	public void setRealCollectNum(Integer realCollectNum) {
		this.realCollectNum = realCollectNum;
	}

	public Integer getVirtualCollectNum() {
		return virtualCollectNum;
	}

	public void setVirtualCollectNum(Integer virtualCollectNum) {
		this.virtualCollectNum = virtualCollectNum;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getIsForeign() {
		return isForeign;
	}

	public void setIsForeign(Integer isForeign) {
		this.isForeign = isForeign;
	}

	public Integer getIsAward() {
		return isAward;
	}

	public void setIsAward(Integer isAward) {
		this.isAward = isAward;
	}

	public Integer getReportNum() {
		return reportNum;
	}

	public void setReportNum(Integer reportNum) {
		this.reportNum = reportNum;
	}

	public Integer getOperateUserId() {
		return operateUserId;
	}

	public void setOperateUserId(Integer operateUserId) {
		this.operateUserId = operateUserId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getStoreScore() {
		return storeScore;
	}

	public void setStoreScore(Integer storeScore) {
		this.storeScore = storeScore;
	}

	public String getStoreTags() {
		return storeTags;
	}

	public void setStoreTags(String storeTags) {
		this.storeTags = storeTags;
	}

	public Integer getPublisherType() {
		return publisherType;
	}

	public void setPublisherType(Integer publisherType) {
		this.publisherType = publisherType;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public BigDecimal getuLongitude() {
		return uLongitude;
	}

	public void setuLongitude(BigDecimal uLongitude) {
		this.uLongitude = uLongitude;
	}

	public BigDecimal getuLatitude() {
		return uLatitude;
	}

	public void setuLatitude(BigDecimal uLatitude) {
		this.uLatitude = uLatitude;
	}

	public String getuAutoAddress() {
		return uAutoAddress;
	}

	public void setuAutoAddress(String uAutoAddress) {
		this.uAutoAddress = uAutoAddress;
	}

	public Integer getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Integer reviewTime) {
		this.reviewTime = reviewTime;
	}

	public Integer getPerConsumption() {
		return perConsumption;
	}

	public void setPerConsumption(Integer perConsumption) {
		this.perConsumption = perConsumption;
	}

	public String getCurrencyUnit() {
		return currencyUnit;
	}

	public void setCurrencyUnit(String currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

	public Integer getIsQualified() {
		return isQualified;
	}

	public void setIsQualified(Integer isQualified) {
		this.isQualified = isQualified;
	}

	public Integer getChoiceTime() {
		return choiceTime;
	}

	public void setChoiceTime(Integer choiceTime) {
		this.choiceTime = choiceTime;
	}

	public Integer getIsHotShield() {
		return isHotShield;
	}

	public void setIsHotShield(Integer isHotShield) {
		this.isHotShield = isHotShield;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public Integer getIsConsumeShield() {
		return isConsumeShield;
	}

	public void setIsConsumeShield(Integer isConsumeShield) {
		this.isConsumeShield = isConsumeShield;
	}

	public Integer getIsCustom() {
		return isCustom;
	}

	public void setIsCustom(Integer isCustom) {
		this.isCustom = isCustom;
	}

	public String getShopOwnerContent() {
		return shopOwnerContent;
	}

	public void setShopOwnerContent(String shopOwnerContent) {
		this.shopOwnerContent = shopOwnerContent;
	}

	public Integer getRefFreshId() {
		return refFreshId;
	}

	public void setRefFreshId(Integer refFreshId) {
		this.refFreshId = refFreshId;
	}

	public Integer getFreshType() {
		return freshType;
	}

	public void setFreshType(Integer freshType) {
		this.freshType = freshType;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreIcon() {
		return storeIcon;
	}

	public void setStoreIcon(String storeIcon) {
		this.storeIcon = storeIcon;
	}

	public String getBusinessAreaName() {
		return businessAreaName;
	}

	public void setBusinessAreaName(String businessAreaName) {
		this.businessAreaName = businessAreaName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
