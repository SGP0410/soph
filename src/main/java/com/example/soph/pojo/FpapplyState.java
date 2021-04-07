package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:31
 */
public class FpapplyState {
    /**
     * stateid
     * statename
     */

    private String stateid;
    private String statename;

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
        this.stateid = stateid;
    }

    @Override
    public String toString() {
        return "FpapplyState{" +
                "stateid='" + stateid + '\'' +
                ", statename='" + statename + '\'' +
                '}';
    }
}
