package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:39
 */
public class FpSeek {
    /**
     * seekid
     * seektitle
     * seektime
     * seeker
     * seekcontent
     * tel
     * userid
     */

    private String seekid;
    private String seektitle;
    private String seektime;
    private String seeker;
    private String seekcontent;
    private String tel;
    private String userid;

    public String getSeekid() {
        return seekid;
    }

    public void setSeekid(String seekid) {
        this.seekid = seekid;
    }

    public String getSeektitle() {
        return seektitle;
    }

    public void setSeektitle(String seektitle) {
        this.seektitle = seektitle;
    }

    public String getSeektime() {
        return seektime;
    }

    public void setSeektime(String seektime) {
        this.seektime = seektime;
    }

    public String getSeeker() {
        return seeker;
    }

    public void setSeeker(String seeker) {
        this.seeker = seeker;
    }

    public String getSeekcontent() {
        return seekcontent;
    }

    public void setSeekcontent(String seekcontent) {
        this.seekcontent = seekcontent;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "FpSeek{" +
                "seekid='" + seekid + '\'' +
                ", seektitle='" + seektitle + '\'' +
                ", seektime='" + seektime + '\'' +
                ", seeker='" + seeker + '\'' +
                ", seekcontent='" + seekcontent + '\'' +
                ", tel='" + tel + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}
