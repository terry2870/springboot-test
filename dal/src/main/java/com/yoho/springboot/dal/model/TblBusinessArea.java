package com.yoho.springboot.dal.model;

import javax.persistence.Id;

import com.hp.core.common.beans.BaseBean;

public class TblBusinessArea extends BaseBean {
    /**
	 * 
	 */
	private static final long serialVersionUID = -495203029412883606L;

	@Id
	private Integer id;

    private String name;

    private String englishName;

    private String nameTc;

    private String headPic;

    private String description;

    private String descriptionTc;

    private Integer cityId;

    private Integer adminId;

    private String adminName;

    private Boolean isShield;

    private Boolean isDelete;

    private Integer createTime;

    private Integer isTop;

    private Integer topTime;

    private Integer isRecommend;

    private Integer recommendTime;

    private Integer sort;

    private Integer storeNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getNameTc() {
        return nameTc;
    }

    public void setNameTc(String nameTc) {
        this.nameTc = nameTc == null ? null : nameTc.trim();
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    public Boolean getIsShield() {
        return isShield;
    }

    public void setIsShield(Boolean isShield) {
        this.isShield = isShield;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getTopTime() {
        return topTime;
    }

    public void setTopTime(Integer topTime) {
        this.topTime = topTime;
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

    public Integer getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }
}