package com.yoho.springboot.dal.model;

import java.math.BigDecimal;

import javax.persistence.Id;

import com.hp.core.common.beans.BaseBean;

public class TblStoreDianping extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4011134617356106789L;

	@Id
	private Integer id;

	private String storeCode;
	
	private String storeName;
	
	private String storeEnglishName;
	
	private String storeSubTitle;
	
	private String storeNameTc;
	
	private String website;
	
	private String relationEmail;
	
	private BigDecimal longitude;
	
	private BigDecimal latitude;
	
	private Integer isForeign;
	
	private String phone;
	
	private String mobilePrefix;
	
	private String mobile;
	
	private String description;
	
	private String descriptionTc;
	
	private String icon;
	
	private String headpic;
	
	private Integer score;
	
	private Integer assessmentUser;
	
	private Integer assessmentNum;
	
	/**
	 * 人均消费
	 */
	private Integer consumption;
	
	/**
	 * 营业时间
	 */
	private String openingTime;
	
	/**
	 * 省
	 */
	private Integer provice;
	
	/**
	 * 市
	 */
	private Integer city;
	
	/**
	 * 区
	 */
	private Integer area;
	
	/**
	 * 详细地址
	 */
	private String address;
	
	/**
	 * 详细地址繁体
	 */
	private String addressTc;
	
	/**
	 * 地址信息
	 */
	private String addressFull;
	
	/**
	 * 商圈ID
	 */
	private Integer businessAreaId;
	
	/**
	 * 管理员id
	 */
	private Integer adminId;
	
	/**
	 * 管理员名称
	 */
	private String adminName;
	
	/**
	 * 是否屏蔽 0 否 1 是
	 */
	private Integer isShield;
	
	/**
	 * 屏蔽原因
	 */
	private String shieldReason;
	
	/**
	 * 排序
	 */
	private Integer orderBy;
	
	/**
	 * 创建时间
	 */
	private Integer createTime;
	
	/**
	 * 更新时间
	 */
	private Integer updateTime;
	
	/**
	 * 是否推荐
	 */
	private Integer isRecommend;
	
	/**
	 * 0:非广告;1:广告
	 */
	private Integer isAd;
	
	private Integer sort;
	
	/**
	 * 被收藏基数
	 */
	private Integer collectBaseNumber;
	
	/**
	 * 小程序编辑之选
	 */
	private String littleFeaturedLogo;
	
	/**
	 * app编辑之选
	 */
	private String featuredLogo;
	
	/**
	 * app编辑之选跳转
	 */
	private String featuredUrl;
	
	/**
	 * 头部广告
	 */
	private String adsPic;

	/**
	 * 品类置顶
	 */
	private Integer categoryTop;
	
	/**
	 * 商圈置顶
	 */
	private Integer bizTop;
	
	private Integer relationUid;
	
	/**
	 * 小程序投票基数
	 */
	private Integer voteBaseNumber;

	/**
	 * 0:未开启；1:已开启
	 */
	private Integer voteStatus;
	
	/**
	 * 热度值，24小时内，增加一条评价，热度加10
	 */
	private Integer hotValue;
	
	/**
	 * 是否是top20店铺，1-是，0不是
	 */
	private Integer isTop20;
	
	/**
	 * App用户之选
	 */
	private String featuredLogoUser;
	
	/**
	 * App用户之选跳转
	 */
	private String featuredUrlUser;
	
	/**
	 * 用户之选（小程序）
	 */
	private String littleFeaturedLogoUser;
	
	/**
	 * 推荐到首页时间（为0，则没有）
	 */
	private Integer indexTime;
	
	/**
	 * 根据坐标生成的静态图
	 */
	private String staticMap;
	
	/**
	 * 静态地图是否更新 0-未更新，1-已更新
	 */
	private Integer staticMapUpdate;
	
	/**
	 * GPS经度坐标
	 */
	private BigDecimal longitudeGps;
	
	/**
	 * GPS维度坐标
	 */
	private BigDecimal latitudeGps;
	
	/**
	 * 店铺来源（1-mars；2-大众点评）
	 */
	private Integer storeSource;
	
	/**
	 * 是否mara店铺（0-否；1是）
	 */
	private Integer isMarsStore;
	
	/**
	 * 店铺状态
	 */
	private Integer storeStatus;
	
	private Integer shopId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getRelationEmail() {
		return relationEmail;
	}

	public void setRelationEmail(String relationEmail) {
		this.relationEmail = relationEmail;
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

	public Integer getIsForeign() {
		return isForeign;
	}

	public void setIsForeign(Integer isForeign) {
		this.isForeign = isForeign;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilePrefix() {
		return mobilePrefix;
	}

	public void setMobilePrefix(String mobilePrefix) {
		this.mobilePrefix = mobilePrefix;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getHeadpic() {
		return headpic;
	}

	public void setHeadpic(String headpic) {
		this.headpic = headpic;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getAssessmentUser() {
		return assessmentUser;
	}

	public void setAssessmentUser(Integer assessmentUser) {
		this.assessmentUser = assessmentUser;
	}

	public Integer getAssessmentNum() {
		return assessmentNum;
	}

	public void setAssessmentNum(Integer assessmentNum) {
		this.assessmentNum = assessmentNum;
	}

	public Integer getConsumption() {
		return consumption;
	}

	public void setConsumption(Integer consumption) {
		this.consumption = consumption;
	}

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public Integer getProvice() {
		return provice;
	}

	public void setProvice(Integer provice) {
		this.provice = provice;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
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

	public Integer getBusinessAreaId() {
		return businessAreaId;
	}

	public void setBusinessAreaId(Integer businessAreaId) {
		this.businessAreaId = businessAreaId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public Integer getIsShield() {
		return isShield;
	}

	public void setIsShield(Integer isShield) {
		this.isShield = isShield;
	}

	public String getShieldReason() {
		return shieldReason;
	}

	public void setShieldReason(String shieldReason) {
		this.shieldReason = shieldReason;
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

	public Integer getIsAd() {
		return isAd;
	}

	public void setIsAd(Integer isAd) {
		this.isAd = isAd;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getCollectBaseNumber() {
		return collectBaseNumber;
	}

	public void setCollectBaseNumber(Integer collectBaseNumber) {
		this.collectBaseNumber = collectBaseNumber;
	}

	public String getLittleFeaturedLogo() {
		return littleFeaturedLogo;
	}

	public void setLittleFeaturedLogo(String littleFeaturedLogo) {
		this.littleFeaturedLogo = littleFeaturedLogo;
	}

	public String getFeaturedLogo() {
		return featuredLogo;
	}

	public void setFeaturedLogo(String featuredLogo) {
		this.featuredLogo = featuredLogo;
	}

	public String getFeaturedUrl() {
		return featuredUrl;
	}

	public void setFeaturedUrl(String featuredUrl) {
		this.featuredUrl = featuredUrl;
	}

	public String getAdsPic() {
		return adsPic;
	}

	public void setAdsPic(String adsPic) {
		this.adsPic = adsPic;
	}

	public Integer getCategoryTop() {
		return categoryTop;
	}

	public void setCategoryTop(Integer categoryTop) {
		this.categoryTop = categoryTop;
	}

	public Integer getBizTop() {
		return bizTop;
	}

	public void setBizTop(Integer bizTop) {
		this.bizTop = bizTop;
	}

	public Integer getRelationUid() {
		return relationUid;
	}

	public void setRelationUid(Integer relationUid) {
		this.relationUid = relationUid;
	}

	public Integer getVoteBaseNumber() {
		return voteBaseNumber;
	}

	public void setVoteBaseNumber(Integer voteBaseNumber) {
		this.voteBaseNumber = voteBaseNumber;
	}

	public Integer getVoteStatus() {
		return voteStatus;
	}

	public void setVoteStatus(Integer voteStatus) {
		this.voteStatus = voteStatus;
	}

	public Integer getHotValue() {
		return hotValue;
	}

	public void setHotValue(Integer hotValue) {
		this.hotValue = hotValue;
	}

	public Integer getIsTop20() {
		return isTop20;
	}

	public void setIsTop20(Integer isTop20) {
		this.isTop20 = isTop20;
	}

	public String getFeaturedLogoUser() {
		return featuredLogoUser;
	}

	public void setFeaturedLogoUser(String featuredLogoUser) {
		this.featuredLogoUser = featuredLogoUser;
	}

	public String getFeaturedUrlUser() {
		return featuredUrlUser;
	}

	public void setFeaturedUrlUser(String featuredUrlUser) {
		this.featuredUrlUser = featuredUrlUser;
	}

	public String getLittleFeaturedLogoUser() {
		return littleFeaturedLogoUser;
	}

	public void setLittleFeaturedLogoUser(String littleFeaturedLogoUser) {
		this.littleFeaturedLogoUser = littleFeaturedLogoUser;
	}

	public Integer getIndexTime() {
		return indexTime;
	}

	public void setIndexTime(Integer indexTime) {
		this.indexTime = indexTime;
	}

	public String getStaticMap() {
		return staticMap;
	}

	public void setStaticMap(String staticMap) {
		this.staticMap = staticMap;
	}

	public Integer getStaticMapUpdate() {
		return staticMapUpdate;
	}

	public void setStaticMapUpdate(Integer staticMapUpdate) {
		this.staticMapUpdate = staticMapUpdate;
	}

	public BigDecimal getLongitudeGps() {
		return longitudeGps;
	}

	public void setLongitudeGps(BigDecimal longitudeGps) {
		this.longitudeGps = longitudeGps;
	}

	public BigDecimal getLatitudeGps() {
		return latitudeGps;
	}

	public void setLatitudeGps(BigDecimal latitudeGps) {
		this.latitudeGps = latitudeGps;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getStoreStatus() {
		return storeStatus;
	}

	public void setStoreStatus(Integer storeStatus) {
		this.storeStatus = storeStatus;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	

}