package com.example.soph.pojo;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:52
 */
public class FpVilliager {
    /**
     * villiagerid
     * name
     * villid
     */

    private String villiagerid;
    private String name;
    private String villid;

    public String getVilliagerid() {
        return villiagerid;
    }

    public void setVilliagerid(String villiagerid) {
        this.villiagerid = villiagerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillid() {
        return villid;
    }

    public void setVillid(String villid) {
        this.villid = villid;
    }

    @Override
    public String toString() {
        return "FpVilliager{" +
                "villiagerid='" + villiagerid + '\'' +
                ", name='" + name + '\'' +
                ", villid='" + villid + '\'' +
                '}';
    }
}
