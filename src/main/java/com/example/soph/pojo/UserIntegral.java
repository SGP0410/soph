package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/19 11:31 星期一
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserIntegral {

    private String id;
    private int integral;
    private String way;
    private String userid;
    private String time;
    private String recording;

}
