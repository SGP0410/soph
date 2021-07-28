package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/24 17:53 星期六
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch {

    private String id;
    private String name;
    private String address;
    private String tel;

}
