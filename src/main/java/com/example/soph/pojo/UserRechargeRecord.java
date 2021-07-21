package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/19 11:32 星期一
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRechargeRecord {

    private String id;
    private int recharge_amount;
    private String time;
    private String recharge_method;
    private String userid;
    private String way;

}
