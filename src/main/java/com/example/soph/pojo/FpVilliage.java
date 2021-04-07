package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:41
 */
public class FpVilliage {
    /**
     * villid
     * villname
     * villpicture
     * villaddress
     * villdesc
     */

    private String villid;
    private String villname;
    private String villpicture;
    private String villaddress;
    private String villdesc;

    @Override
    public String toString() {
        return "FpVilliage{" +
                "villid='" + villid + '\'' +
                ", villname='" + villname + '\'' +
                ", villpicture='" + villpicture + '\'' +
                ", villaddress='" + villaddress + '\'' +
                ", villdesc='" + villdesc + '\'' +
                '}';
    }

    public String getVillid() {
        return villid;
    }

    public void setVillid(String villid) {
        this.villid = villid;
    }

    public String getVillname() {
        return villname;
    }

    public void setVillname(String villname) {
        this.villname = villname;
    }

    public String getVillpicture() {
        return villpicture;
    }

    public void setVillpicture(String villpicture) {
        this.villpicture = villpicture;
    }

    public String getVilladdress() {
        return villaddress;
    }

    public void setVilladdress(String villaddress) {
        this.villaddress = villaddress;
    }

    public String getVilldesc() {
        return villdesc;
    }

    public void setVilldesc(String villdesc) {
        this.villdesc = villdesc;
    }
}
