package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/19 16:21 星期一
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gas_recording {

    private String id;
    private String petrol;
    private String petrolmoney;
    private String time;
    private String mileage;
    private String price;
    private String volume;

}
