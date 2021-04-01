package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/4/1 9:19 星期四
 */

public class Actioncommit {

    /**
     * num
     * id
     * userid
     * commitTime
     * commitContent
     */


    private String num;
    private String id;
    private String userid;
    private String commitTime;
    private String commitContent;

    public Actioncommit() {
    }

    public Actioncommit(String num, String id, String userid, String commitTime, String commitContent) {
        this.num = num;
        this.id = id;
        this.userid = userid;
        this.commitTime = commitTime;
        this.commitContent = commitContent;
    }

    @Override
    public String toString() {
        return "Actioncommit{" +
                "num='" + num + '\'' +
                ", id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", commitTime='" + commitTime + '\'' +
                ", commitContent='" + commitContent + '\'' +
                '}';
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

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

    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }

    public String getCommitContent() {
        return commitContent;
    }

    public void setCommitContent(String commitContent) {
        this.commitContent = commitContent;
    }
}
