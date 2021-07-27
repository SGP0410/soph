package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/24 12:55 星期六
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WrittenJudgement {

    private String id;
    private String pes;
    private String number;
    private String userName;
    private String jszFileNumber;
    private String jszNumber;
    private String quasiDrivingType;
    private String tel;
    private String cph;
    private String vehicleType;
    private String fzOffice;
    private String violationDate;
    private String behavior;
    private String address;
    private String money;
    private String integral;
    private String punishOffice;
    private String punishDate;


}
