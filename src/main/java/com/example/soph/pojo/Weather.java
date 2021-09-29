package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/9/18 11:51 星期六
 * @Description com.example.soph.pojo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {


    private int currentTemperature;
    private int maximumTemperature;
    private int minimumTemperature;
    private String weatherSituation;
    private String airQuality;
    private int airHumidity;
    private int sensibleTemperature;
    private int ultravioletIndex;

}
