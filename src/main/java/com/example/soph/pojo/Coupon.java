package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/10/11 星期一
 * @Description com.example.soph.pojo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    private String id;
    private String image;
    private String faceValue;
    private String msgs;
    private String consume;

}
