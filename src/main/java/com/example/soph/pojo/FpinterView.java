package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:35
 */
public class FpinterView {
    /**
     * interviewid
     * villiagerid
     * starttime
     * endtime
     * intent
     * userid
     */

    private String interviewid;
    private String villiagerid;
    private String starttime;
    private String endtime;
    private String intent;
    private String userid;

    public String getInterviewid() {
        return interviewid;
    }

    public void setInterviewid(String interviewid) {
        this.interviewid = interviewid;
    }

    public String getVilliagerid() {
        return villiagerid;
    }

    public void setVilliagerid(String villiagerid) {
        this.villiagerid = villiagerid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "FpinterView{" +
                "interviewid='" + interviewid + '\'' +
                ", villiagerid='" + villiagerid + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", intent='" + intent + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}
