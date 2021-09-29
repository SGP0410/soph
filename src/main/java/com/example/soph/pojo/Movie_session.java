package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/18 11:27 星期日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie_session {

    private String id;
    private String Movieid;
    private String Movietitle;
    private String begin;
    private String end;
    private String MovieName;
    private String price;
    private String MovieType;
    private String play_type;
    private String pricing;
    private String feature;
    private String address;

}
