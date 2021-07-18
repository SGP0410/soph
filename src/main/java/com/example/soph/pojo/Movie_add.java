package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/18 11:28 星期日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie_add {

    private String id;
    private String Movietitle;
    private String img;
    private String address;
    private String fraction;
    private String msg;

}
