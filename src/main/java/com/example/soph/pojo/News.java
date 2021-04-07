package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/30 15:40
 */
public class News {
    private String id;
    private String searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String dictCode;
    private String title;
    private String content;
    private String imgUrl;
    private String pressCategory;
    private String isRecommend;
    private String likeNumber;
    private String viewsNumber;
    private String userId;
    private String pressStatus;
    private String pressId;
    private String theme;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
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

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPressCategory() {
        return pressCategory;
    }

    public void setPressCategory(String pressCategory) {
        this.pressCategory = pressCategory;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(String likeNumber) {
        this.likeNumber = likeNumber;
    }

    public String getViewsNumber() {
        return viewsNumber;
    }

    public void setViewsNumber(String viewsNumber) {
        this.viewsNumber = viewsNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPressStatus() {
        return pressStatus;
    }

    public void setPressStatus(String pressStatus) {
        this.pressStatus = pressStatus;
    }

    public String getPressId() {
        return pressId;
    }

    public void setPressId(String pressId) {
        this.pressId = pressId;
    }

    @Override
    public String toString() {
        return "News{" +
                "id='" + id + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remark='" + dictCode + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", pressCategory='" + pressCategory + '\'' +
                ", isRecommend='" + isRecommend + '\'' +
                ", likeNumber='" + likeNumber + '\'' +
                ", viewsNumber='" + viewsNumber + '\'' +
                ", userId='" + userId + '\'' +
                ", pressStatus='" + pressStatus + '\'' +
                ", pressId='" + pressId + '\'' +
                '}';
    }
}
