package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/18 11:26 星期日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie_status {

    private String id;
    private String movieid;
    private String status;
    private String username;
    private String statusmsg;

}
