package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/24 10:56 星期六
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleInformationBinding {

    private String id;
    private String userId;
    private String type;
    private String number;
    private String effectiveDate;
    private String idCard;



}
