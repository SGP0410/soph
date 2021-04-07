package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:30
 */
public class Fpapply {
    /**
     * applyid
     * applytitle
     * applydesc
     * applycontent
     * villid
     * starttime
     * helpdesc
     * applystate
     * userid
     */
    private String applyid;
    private String applytitle;
    private String applydesc;
    private String applycontent;
    private String villid;
    private String starttime;
    private String helpdesc;
    private String applystate;
    private String userid;

    @Override
    public String toString() {
        return "Fpapply{" +
                "applyid='" + applyid + '\'' +
                ", applytitle='" + applytitle + '\'' +
                ", applydesc='" + applydesc + '\'' +
                ", applycontent='" + applycontent + '\'' +
                ", villid='" + villid + '\'' +
                ", starttime='" + starttime + '\'' +
                ", helpdesc='" + helpdesc + '\'' +
                ", applystate='" + applystate + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }

    public String getApplyid() {
        return applyid;
    }

    public void setApplyid(String applyid) {
        this.applyid = applyid;
    }

    public String getApplytitle() {
        return applytitle;
    }

    public void setApplytitle(String applytitle) {
        this.applytitle = applytitle;
    }

    public String getApplydesc() {
        return applydesc;
    }

    public void setApplydesc(String applydesc) {
        this.applydesc = applydesc;
    }

    public String getApplycontent() {
        return applycontent;
    }

    public void setApplycontent(String applycontent) {
        this.applycontent = applycontent;
    }

    public String getVillid() {
        return villid;
    }

    public void setVillid(String villid) {
        this.villid = villid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getHelpdesc() {
        return helpdesc;
    }

    public void setHelpdesc(String helpdesc) {
        this.helpdesc = helpdesc;
    }

    public String getApplystate() {
        return applystate;
    }

    public void setApplystate(String applystate) {
        this.applystate = applystate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
