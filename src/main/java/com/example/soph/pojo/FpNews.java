package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:37
 */
public class FpNews {
    /**
     * newsid
     * newstitle
     * newsreporter
     * reporttime
     * newspicture
     * newscontent
     * readnum
     * isfront
     * isfront
     */

    private String newsid;
    private String newstitle;
    private String newsreporter;
    private String reporttime;
    private String newspicture;
    private String newscontent;
    private String readnum;
    private String isfront;

    public String getNewsid() {
        return newsid;
    }

    public void setNewsid(String newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewsreporter() {
        return newsreporter;
    }

    public void setNewsreporter(String newsreporter) {
        this.newsreporter = newsreporter;
    }

    public String getReporttime() {
        return reporttime;
    }

    public void setReporttime(String reporttime) {
        this.reporttime = reporttime;
    }

    public String getNewspicture() {
        return newspicture;
    }

    public void setNewspicture(String newspicture) {
        this.newspicture = newspicture;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    public String getReadnum() {
        return readnum;
    }

    public void setReadnum(String readnum) {
        this.readnum = readnum;
    }

    public String getIsfront() {
        return isfront;
    }

    public void setIsfront(String isfront) {
        this.isfront = isfront;
    }

    @Override
    public String toString() {
        return "FpNews{" +
                "newsid='" + newsid + '\'' +
                ", newstitle='" + newstitle + '\'' +
                ", newsreporter='" + newsreporter + '\'' +
                ", reporttime='" + reporttime + '\'' +
                ", newspicture='" + newspicture + '\'' +
                ", newscontent='" + newscontent + '\'' +
                ", readnum='" + readnum + '\'' +
                ", isfront='" + isfront + '\'' +
                '}';
    }
}
