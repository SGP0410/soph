package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/4/1 10:41 星期四
 */

public class Actiontype {

    /**
     * typeid
     * typename
     * typename
     */


    private String typeid;
    private String typename;

    public Actiontype() {
    }

    public Actiontype(String typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "Actiontype{" +
                "typeid='" + typeid + '\'' +
                ", typename='" + typename + '\'' +
                '}';
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
