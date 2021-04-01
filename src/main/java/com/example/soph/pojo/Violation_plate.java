package com.example.soph.pojo;

/**
 * @author 关鑫
 * @date 2021/3/31 21:25 星期三
 */

public class Violation_plate {

    private String id;
    private String plate;

    public Violation_plate() {
    }

    public Violation_plate(String id, String plate) {
        this.id = id;
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Violation_plate{" +
                "id='" + id + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
