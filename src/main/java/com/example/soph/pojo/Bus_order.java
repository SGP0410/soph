package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 20:39 星期三
 */

public class Bus_order {

    private String id;
    private String linesId;
    private String searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String remark;
    private String orderNum;
    private String path;
    private String start;
    private String end;
    private String price;
    private String userName;
    private String userTel;
    private String userId;
    private String status;

    public Bus_order() {
    }

    public Bus_order(String id, String linesId, String searchValue, String createBy, String createTime, String updateBy, String updateTime, String remark, String orderNum, String path, String start, String end, String price, String userName, String userTel, String userId, String status) {
        this.id = id;
        this.linesId = linesId;
        this.searchValue = searchValue;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
        this.orderNum = orderNum;
        this.path = path;
        this.start = start;
        this.end = end;
        this.price = price;
        this.userName = userName;
        this.userTel = userTel;
        this.userId = userId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bus_order{" +
                "id='" + id + '\'' +
                ", linesId='" + linesId + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + remark + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", path='" + path + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", price='" + price + '\'' +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userId='" + userId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLinesId() {
        return linesId;
    }

    public void setLinesId(String linesId) {
        this.linesId = linesId;
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

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
