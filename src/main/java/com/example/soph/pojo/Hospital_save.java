package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 20:01 星期三
 */

public class Hospital_save {

    private String id;
    private String searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String remark;
    private String orderNo;
    private String patientName;
    private String categoryName;
    private String did;
    private String moeny;
    private String startime;
    private String reservedStatus;
    private String userId;
    private String tel;
    private String carid;

    public Hospital_save() {
    }

    public Hospital_save(String id, String searchValue, String createBy, String createTime, String updateBy, String updateTime, String remark, String orderNo, String patientName, String categoryName, String did, String moeny, String startime, String reservedStatus, String userId, String tel, String carid) {
        this.id = id;
        this.searchValue = searchValue;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
        this.orderNo = orderNo;
        this.patientName = patientName;
        this.categoryName = categoryName;
        this.did = did;
        this.moeny = moeny;
        this.startime = startime;
        this.reservedStatus = reservedStatus;
        this.userId = userId;
        this.tel = tel;
        this.carid = carid;
    }

    @Override
    public String toString() {
        return "Hospital_save{" +
                "id='" + id + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + remark + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", patientName='" + patientName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", did='" + did + '\'' +
                ", moeny='" + moeny + '\'' +
                ", startime='" + startime + '\'' +
                ", reservedStatus='" + reservedStatus + '\'' +
                ", userId='" + userId + '\'' +
                ", tel='" + tel + '\'' +
                ", carid='" + carid + '\'' +
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getMoeny() {
        return moeny;
    }

    public void setMoeny(String moeny) {
        this.moeny = moeny;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getReservedStatus() {
        return reservedStatus;
    }

    public void setReservedStatus(String reservedStatus) {
        this.reservedStatus = reservedStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }
}
