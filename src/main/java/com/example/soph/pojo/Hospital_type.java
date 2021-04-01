package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 19:42 星期三
 */

public class Hospital_type {

    /**
     * id
     * searchValue
     * createBy
     * createTime
     * updateBy
     * updateTime
     * remark
     * did
     * categoryName
     * money
     * desc
     * tag
     * hospitalId
     * hospitalId
     */



    private String id;
    private String searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String remark;
    private String did;
    private String categoryName;
    private String money;
    private String desc;
    private String tag;
    private String hospitalId;

    public Hospital_type() {
    }

    public Hospital_type(String id, String searchValue, String createBy, String createTime, String updateBy, String updateTime, String remark, String did, String categoryName, String money, String desc, String tag, String hospitalId) {
        this.id = id;
        this.searchValue = searchValue;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
        this.did = did;
        this.categoryName = categoryName;
        this.money = money;
        this.desc = desc;
        this.tag = tag;
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return "Hospital_type{" +
                "id='" + id + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + remark + '\'' +
                ", did='" + did + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", money='" + money + '\'' +
                ", desc='" + desc + '\'' +
                ", tag='" + tag + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
}
