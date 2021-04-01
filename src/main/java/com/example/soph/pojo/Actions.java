package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/4/1 9:36 星期四
 */

public class Actions {

    /**
     * id
     * typeid
     * time
     * name
     * count
     * praiseCount
     * description
     * image
     * recommand
     * showImage
     */

    private String id;
    private String typeid;
    private String time;
    private String name;
    private String count;
    private String praiseCount;
    private String description;
    private String image;
    private String recommand;
    private String showImage;

    public Actions() {
    }

    public Actions(String id, String typeid, String time, String name, String count, String praiseCount, String description, String image, String recommand, String showImage) {
        this.id = id;
        this.typeid = typeid;
        this.time = time;
        this.name = name;
        this.count = count;
        this.praiseCount = praiseCount;
        this.description = description;
        this.image = image;
        this.recommand = recommand;
        this.showImage = showImage;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "id='" + id + '\'' +
                ", typeid='" + typeid + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                ", count='" + count + '\'' +
                ", praiseCount='" + praiseCount + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", recommand='" + recommand + '\'' +
                ", showImage='" + showImage + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(String praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRecommand() {
        return recommand;
    }

    public void setRecommand(String recommand) {
        this.recommand = recommand;
    }

    public String getShowImage() {
        return showImage;
    }

    public void setShowImage(String showImage) {
        this.showImage = showImage;
    }
}
