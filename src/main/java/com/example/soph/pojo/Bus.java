package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 20:17 星期三
 */

public class Bus {

    /**
     * id
     * searchValue
     * createBy
     * createTime
     * updateBy
     * updateTime
     * remark
     * endTime
     * name
     * first
     * end
     * startTime
     * price
     * mileage
     * linesId
     * linesId
     */

    private String id;
    private String searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String remark;
    private String endTime;
    private String name;
    private String first;
    private String end;
    private String startTime;
    private String price;
    private String mileage;
    private String linesId;

    public Bus() {
    }

    public Bus(String id, String searchValue, String createBy, String createTime, String updateBy, String updateTime, String remark, String endTime, String name, String first, String end, String startTime, String price, String mileage, String linesId) {
        this.id = id;
        this.searchValue = searchValue;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
        this.endTime = endTime;
        this.name = name;
        this.first = first;
        this.end = end;
        this.startTime = startTime;
        this.price = price;
        this.mileage = mileage;
        this.linesId = linesId;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + remark + '\'' +
                ", endTime='" + endTime + '\'' +
                ", name='" + name + '\'' +
                ", first='" + first + '\'' +
                ", end='" + end + '\'' +
                ", startTime='" + startTime + '\'' +
                ", price='" + price + '\'' +
                ", mileage='" + mileage + '\'' +
                ", linesId='" + linesId + '\'' +
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

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getLinesId() {
        return linesId;
    }

    public void setLinesId(String linesId) {
        this.linesId = linesId;
    }
}
