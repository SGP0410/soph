package com.example.soph.pojo;

import com.example.soph.utils.ServletUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/10/6 星期三
 * @Descriptioncom.example.soph.pojo
 * @User XGKerwin
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking_comeon {

    private String id;
    private String plateNumber;
    private String oilVolume;
    private String money;
    private String time;
    private String mileage;
    private String oilPrice;
    private String Volume;
    private String msg;

}
