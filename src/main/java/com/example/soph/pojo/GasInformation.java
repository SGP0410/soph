package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/19 15:27 星期一
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GasInformation {

    private String id;
    private String gasname;
    private String img;
    private String release_time;
    private String read;
    private String msg;
    private String like;
    private String gasid;

}
