package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/5 19:01
 */
public class Duty {
    /**
     *   {
     *             "num": 17,
     *             "hospitalId": "1",
     *             "departmentId": "4",
     *             "time": "2020-10-10 周六 上午8：00",
     *             "type": "普通门诊",
     *             "doctorId": "8"
     *         }
     */


    private String hospitalId;
    private String departmentId;
    private String time;
    private String type;
    private String doctorId;

    public Duty(String hospitalId, String departmentId, String time, String type, String doctorId) {
        this.hospitalId = hospitalId;
        this.departmentId = departmentId;
        this.time = time;
        this.type = type;
        this.doctorId = doctorId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
}
