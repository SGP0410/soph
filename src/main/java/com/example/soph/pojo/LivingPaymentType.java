package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 8:11
 */
public class LivingPaymentType {
    /**
     * id
     * userid
     * typeName
     */

    public String id;
    public String userid;
    public String typeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "LivingPaymentType{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
