package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 8:09
 */
public class Livingpayment {
    /**
     * id
     * searchValue
     * createBy
     * createTime
     * updateBy
     * updateTime
     * remark
     * ownerName
     * typeName
     * payObjectId
     * liveName
     * doorNo
     * userId
     * classifyId
     * balance
     * chargeUnit
     * electricityMoney
     * title
     * electricityId
     * obId
     * doorId
     */
    public String id;
    public String searchValue;
    public String createBy;
    public String createTime;
    public String updateBy;
    public String updateTime;
    public String remark;
    public String ownerName;
    public String typeName;
    public String payObjectId;
    public String liveName;
    public String doorNo;
    public String userId;
    public String classifyId;
    public String balance;
    public String chargeUnit;
    public String electricityMoney;
    public String title;
    public String electricityId;
    public String obId;
    public String doorId;

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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPayObjectId() {
        return payObjectId;
    }

    public void setPayObjectId(String payObjectId) {
        this.payObjectId = payObjectId;
    }

    public String getLiveName() {
        return liveName;
    }

    public void setLiveName(String liveName) {
        this.liveName = liveName;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public String getElectricityMoney() {
        return electricityMoney;
    }

    public void setElectricityMoney(String electricityMoney) {
        this.electricityMoney = electricityMoney;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getElectricityId() {
        return electricityId;
    }

    public void setElectricityId(String electricityId) {
        this.electricityId = electricityId;
    }

    public String getObId() {
        return obId;
    }

    public void setObId(String obId) {
        this.obId = obId;
    }

    public String getDoorId() {
        return doorId;
    }

    public void setDoorId(String doorId) {
        this.doorId = doorId;
    }

    @Override
    public String toString() {
        return "Livingpayment{" +
                "id='" + id + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + remark + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", payObjectId='" + payObjectId + '\'' +
                ", liveName='" + liveName + '\'' +
                ", doorNo='" + doorNo + '\'' +
                ", userId='" + userId + '\'' +
                ", classifyId='" + classifyId + '\'' +
                ", balance='" + balance + '\'' +
                ", chargeUnit='" + chargeUnit + '\'' +
                ", electricityMoney='" + electricityMoney + '\'' +
                ", title='" + title + '\'' +
                ", electricityId='" + electricityId + '\'' +
                ", obId='" + obId + '\'' +
                ", doorId='" + doorId + '\'' +
                '}';
    }
}
