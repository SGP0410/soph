package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/10/12 星期二
 * @Description com.example.soph.pojo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driverlicense {

    private String id;
    private String userId;
    private String LicenseNumber;
    private String validPeriod;
    private String carid;
    private String msgs;
    private String msgss;
    private String msgsss;

}
