package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 孙国鹏
 * @date 2021/3/30 17:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Metro {

    /**
     * id
     * searchValue
     * createBy
     * createTime
     * updateBy
     * updateTime
     * remark
     * lineId
     * lineName
     * lastName
     * reachTime
     * currentName
     * img
     * startTime
     * endTime
     */

    private String id;
    private String searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private String remark;
    private String lineId;
    private String lineName;
    private String lastName;
    private String reachTime;
    private String currentName;
    private String img;
    private String startTime;
    private String endTime;
    private String number;
    private String start;
    private String finish;
    private String next;

}
