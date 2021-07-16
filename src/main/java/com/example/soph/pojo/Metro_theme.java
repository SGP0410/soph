package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/6/9 11:25 星期三
 */

public class Metro_theme {


    private String id;
    private String subname;
    private String subpic;
    private String subdesc;
    private String subtime;
    private String type;

    @Override
    public String toString() {
        return "Metro_theme{" +
                "id='" + id + '\'' +
                ", subname='" + subname + '\'' +
                ", subpic='" + subpic + '\'' +
                ", subdesc='" + subdesc + '\'' +
                ", subtime='" + subtime + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getSubpic() {
        return subpic;
    }

    public void setSubpic(String subpic) {
        this.subpic = subpic;
    }

    public String getSubdesc() {
        return subdesc;
    }

    public void setSubdesc(String subdesc) {
        this.subdesc = subdesc;
    }

    public String getSubtime() {
        return subtime;
    }

    public void setSubtime(String subtime) {
        this.subtime = subtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
