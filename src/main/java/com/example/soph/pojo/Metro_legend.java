package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/9/13 19:48 星期一
 * @Description com.example.soph.pojo
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Metro_legend {

    private String id;
    private String image;
    private String msg;
    private String title;
    private String en;
    private String ch;
    private String m1;
    private String m2;
    private String m3;

}
