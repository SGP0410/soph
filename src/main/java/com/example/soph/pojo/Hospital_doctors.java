package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 19:53 星期三
 */

public class Hospital_doctors {

    /**
     * doctorId
     * hospitalId
     * deptId
     * doctorname
     * desc
     * tag
     * tag
     */

    private String doctorId;
    private String hospitalId;
    private String deptId;
    private String doctorname;
    private String desc;
    private String tag;

    public Hospital_doctors() {
    }

    public Hospital_doctors(String doctorId, String hospitalId, String deptId, String doctorname, String desc, String tag) {
        this.doctorId = doctorId;
        this.hospitalId = hospitalId;
        this.deptId = deptId;
        this.doctorname = doctorname;
        this.desc = desc;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Hospital_doctors{" +
                "doctorId='" + doctorId + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", deptId='" + deptId + '\'' +
                ", doctorname='" + doctorname + '\'' +
                ", desc='" + desc + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
