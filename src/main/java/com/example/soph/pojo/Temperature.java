package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/9/18 19:35 星期六
 * @Description com.example.soph.pojo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Temperature {


    /**
     * pm2.5
     * wd
     * sd
     * guangzhao
     * co2
     */


    private int pm;
    private int wendu;
    private int humidity;
    private int light;
    private int co2;



}
