package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/18 11:25 星期日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie_comment {

    private String id;
    private String Movieid;
    private String mark;
    private String conment;
    private String conmentTime;
    private String username;

}
