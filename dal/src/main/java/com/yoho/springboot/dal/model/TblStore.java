package com.yoho.springboot.dal.model;

import java.math.BigDecimal;

import javax.persistence.Id;
import javax.persistence.Transient;

import com.hp.core.common.beans.BaseBean;

public class TblStore extends BaseBean {
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

	private Integer relationUid;

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

	private Integer consumption;

	private String openingTime;

	private Integer provice;

	private Integer city;

	private Integer area;

	private String address;

	private String addressTc;

	private String addressFull;

	private Integer businessAreaId;

	private Integer adminId;

	private String adminName;

	private Integer isShield;

	private Integer orderBy;

	private Integer createTime;

	private Integer updateTime;

	private Integer isRecommend;

	private Integer recommendTime;

	private Integer sort;

	private Integer collectBaseNumber;

	private Integer tagId;

	@Transient
	private Integer isCustom;

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

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
		this.storeCode = storeCode == null ? null : storeCode.trim();
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName == null ? null : storeName.trim();
	}

	public String getStoreEnglishName() {
		return storeEnglishName;
	}

	public void setStoreEnglishName(String storeEnglishName) {
		this.storeEnglishName = storeEnglishName == null ? null : storeEnglishName.trim();
	}

	public String getStoreSubTitle() {
		return storeSubTitle;
	}

	public void setStoreSubTitle(String storeSubTitle) {
		this.storeSubTitle = storeSubTitle == null ? null : storeSubTitle.trim();
	}

	public String getStoreNameTc() {
		return storeNameTc;
	}

	public void setStoreNameTc(String storeNameTc) {
		this.storeNameTc = storeNameTc == null ? null : storeNameTc.trim();
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website == null ? null : website.trim();
	}

	public Integer getRelationUid() {
		return relationUid;
	}

	public void setRelationUid(Integer relationUid) {
		this.relationUid = relationUid;
	}

	public String getRelationEmail() {
		return relationEmail;
	}

	public void setRelationEmail(String relationEmail) {
		this.relationEmail = relationEmail == null ? null : relationEmail.trim();
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
		this.phone = phone == null ? null : phone.trim();
	}

	public String getMobilePrefix() {
		return mobilePrefix;
	}

	public void setMobilePrefix(String mobilePrefix) {
		this.mobilePrefix = mobilePrefix == null ? null : mobilePrefix.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getDescriptionTc() {
		return descriptionTc;
	}

	public void setDescriptionTc(String descriptionTc) {
		this.descriptionTc = descriptionTc == null ? null : descriptionTc.trim();
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
	}

	public String getHeadpic() {
		return headpic;
	}

	public void setHeadpic(String headpic) {
		this.headpic = headpic == null ? null : headpic.trim();
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
		this.openingTime = openingTime == null ? null : openingTime.trim();
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
		this.address = address == null ? null : address.trim();
	}

	public String getAddressTc() {
		return addressTc;
	}

	public void setAddressTc(String addressTc) {
		this.addressTc = addressTc == null ? null : addressTc.trim();
	}

	public String getAddressFull() {
		return addressFull;
	}

	public void setAddressFull(String addressFull) {
		this.addressFull = addressFull == null ? null : addressFull.trim();
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
		this.adminName = adminName == null ? null : adminName.trim();
	}

	public Integer getIsShield() {
		return isShield;
	}

	public void setIsShield(Integer isShield) {
		this.isShield = isShield;
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

	public Integer getCollectBaseNumber() {
		return collectBaseNumber;
	}

	public void setCollectBaseNumber(Integer collectBaseNumber) {
		this.collectBaseNumber = collectBaseNumber;
	}

	public Integer getIsCustom() {
		return isCustom;
	}

	public void setIsCustom(Integer isCustom) {
		this.isCustom = isCustom;
	}
}