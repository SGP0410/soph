package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 21:16 星期三
 */

public class Violation_type {


    /**
     * id
     * catType
     * catType
     */

    private String id;
    private String catType;

    public Violation_type() {
    }

    public Violation_type(String id, String catType) {
        this.id = id;
        this.catType = catType;
    }

    @Override
    public String toString() {
        return "Violation_type{" +
                "id='" + id + '\'' +
                ", catType='" + catType + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}
