package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:50
 */
public class FpVilliageDetail {
    /**
     * detail_id
     * villid
     * environment_pic
     * reporttime
     * report
     * readernum
     */
    private String detail_id;
    private String villid;
    private String environment_pic;
    private String reporttime;
    private String report;
    private String readernum;

    public String getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(String detail_id) {
        this.detail_id = detail_id;
    }

    public String getVillid() {
        return villid;
    }

    public void setVillid(String villid) {
        this.villid = villid;
    }

    public String getEnvironment_pic() {
        return environment_pic;
    }

    public void setEnvironment_pic(String environment_pic) {
        this.environment_pic = environment_pic;
    }

    public String getReporttime() {
        return reporttime;
    }

    public void setReporttime(String reporttime) {
        this.reporttime = reporttime;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getReadernum() {
        return readernum;
    }

    public void setReadernum(String readernum) {
        this.readernum = readernum;
    }

    @Override
    public String toString() {
        return "FpVilliageDetail{" +
                "detail_id='" + detail_id + '\'' +
                ", villid='" + villid + '\'' +
                ", environment_pic='" + environment_pic + '\'' +
                ", reporttime='" + reporttime + '\'' +
                ", report='" + report + '\'' +
                ", readernum='" + readernum + '\'' +
                '}';
    }
}
