package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/4/1 10:29 星期四
 */

public class Actions_slide {

    private String id;
    private String img;
    private String number;

    public Actions_slide() {
    }

    public Actions_slide(String id, String img, String number) {
        this.id = id;
        this.img = img;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Actions_slide{" +
                "id='" + id + '\'' +
                ", img='" + img + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
