package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/30 9:58
 */
public class Slidepicture {
    /**
     * id
     * imgUrl
     * type
     * createTime
     * sort
     * display
     */
    public String id;
    public String imgUrl;
    public String type;
    public String createTime;
    public String sort;
    public String display;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Slidepicture{" +
                "id='" + id + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", type='" + type + '\'' +
                ", createTime='" + createTime + '\'' +
                ", sort='" + sort + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
