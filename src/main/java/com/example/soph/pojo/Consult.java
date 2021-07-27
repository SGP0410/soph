package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/24 17:01 星期六
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consult {

    private String id;
    private String image;
    private String title;
    private String releaseDate;
    private String content;
}
