package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/6/9 11:26 星期三
 */

public class Metrofound {

    private String id;
    private String title;
    private String msg;
    private String time;
    private String location;
    private String store;
    private String status;

    @Override
    public String toString() {
        return "Metrofound{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", msg='" + msg + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", store='" + store + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
