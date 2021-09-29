package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/18 11:20 星期日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie_info {

    private String id;
    private String Movieid;
    private String MovieName;
    private String Moviecover;
    private String showDate;
    private String timeLength;
    private String Moviemark;
    private String markNum;
    private String wantedNum;
    private String lookedNum;
    private String MovieType;
    private String movieDesc;
    private String thumbup;
    private String http;

}
