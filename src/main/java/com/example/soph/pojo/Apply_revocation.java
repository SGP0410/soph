package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/7/24 16:07 星期六
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apply_revocation {

    private String id;
    private String endorsementId;
    private String cause;
    private String time;
    private String type;

}
