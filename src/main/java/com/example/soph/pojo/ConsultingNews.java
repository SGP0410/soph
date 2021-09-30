package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/9/29 11:03 星期三
 * @Description com.example.soph.pojo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultingNews {

    private String id;
    private String title;
    private String cover;
    private String time;
    private String reading;
    private String msg;
    private String like;

}
