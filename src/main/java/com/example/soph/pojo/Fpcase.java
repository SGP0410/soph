package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:33
 */
public class Fpcase {
    /**
     * caseid
     * casetitle
     * casepicture
     * helper
     * reporttime
     * readnum
     * thumbup
     * userid
     * caseContent
     */
//{casetitle:"111",casepicture:"a.jpg",reporttime:"2020-10-2","userid":1,"caseContent":""}
    private String caseid;
    private String casetitle;
    private String casepicture;
    private String helper;
    private String reporttime;
    private String readnum;
    private String thumbup;
    private String userid;
    private String caseContent;

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getCasetitle() {
        return casetitle;
    }

    public void setCasetitle(String casetitle) {
        this.casetitle = casetitle;
    }

    public String getCasepicture() {
        return casepicture;
    }

    public void setCasepicture(String casepicture) {
        this.casepicture = casepicture;
    }

    public String getHelper() {
        return helper;
    }

    public void setHelper(String helper) {
        this.helper = helper;
    }

    public String getReporttime() {
        return reporttime;
    }

    public void setReporttime(String reporttime) {
        this.reporttime = reporttime;
    }

    public String getReadnum() {
        return readnum;
    }

    public void setReadnum(String readnum) {
        this.readnum = readnum;
    }

    public String getThumbup() {
        return thumbup;
    }

    public void setThumbup(String thumbup) {
        this.thumbup = thumbup;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCaseContent() {
        return caseContent;
    }

    public void setCaseContent(String caseContent) {
        this.caseContent = caseContent;
    }

    @Override
    public String toString() {
        return "Fpcase{" +
                "caseid='" + caseid + '\'' +
                ", casetitle='" + casetitle + '\'' +
                ", casepicture='" + casepicture + '\'' +
                ", helper='" + helper + '\'' +
                ", reporttime='" + reporttime + '\'' +
                ", readnum='" + readnum + '\'' +
                ", thumbup='" + thumbup + '\'' +
                ", userid='" + userid + '\'' +
                ", caseContent='" + caseContent + '\'' +
                '}';
    }
}
