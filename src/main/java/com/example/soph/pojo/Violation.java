package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 20:55 星期三
 */

public class Violation {

    private String id;
    private String searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String remark;
    private String licencePlate;
    private String disposeState;
    private String badTime;
    private String money;
    private String deductMarks;
    private String illegalSites;
    private String noticeNo;
    private String engineNumber;

    public Violation() {
    }

    public Violation(String id, String searchValue, String createBy, String createTime, String updateBy, String updateTime, String remark, String licencePlate, String disposeState, String badTime, String money, String deductMarks, String illegalSites, String noticeNo, String engineNumber) {
        this.id = id;
        this.searchValue = searchValue;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
        this.licencePlate = licencePlate;
        this.disposeState = disposeState;
        this.badTime = badTime;
        this.money = money;
        this.deductMarks = deductMarks;
        this.illegalSites = illegalSites;
        this.noticeNo = noticeNo;
        this.engineNumber = engineNumber;
    }

    @Override
    public String toString() {
        return "Violation{" +
                "id='" + id + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + remark + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", disposeState='" + disposeState + '\'' +
                ", badTime='" + badTime + '\'' +
                ", money='" + money + '\'' +
                ", deductMarks='" + deductMarks + '\'' +
                ", illegalSites='" + illegalSites + '\'' +
                ", noticeNo='" + noticeNo + '\'' +
                ", engineNumber='" + engineNumber + '\'' +
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

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getDisposeState() {
        return disposeState;
    }

    public void setDisposeState(String disposeState) {
        this.disposeState = disposeState;
    }

    public String getBadTime() {
        return badTime;
    }

    public void setBadTime(String badTime) {
        this.badTime = badTime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDeductMarks() {
        return deductMarks;
    }

    public void setDeductMarks(String deductMarks) {
        this.deductMarks = deductMarks;
    }

    public String getIllegalSites() {
        return illegalSites;
    }

    public void setIllegalSites(String illegalSites) {
        this.illegalSites = illegalSites;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }
}
