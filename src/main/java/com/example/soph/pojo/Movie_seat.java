package com.example.soph.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 关鑫
 * @date 2021/9/27 12:45 星期一
 * @Description com.example.soph.pojo
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie_seat {

    private String id;
    private String seatNumber;
    private String session;

}
