package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/19 10:38 星期一
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parking_User {

    private String id;
    private String plateNumber;
    private String userid;

}
