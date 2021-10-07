package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.ParkingDaoImpl;
import com.example.soph.pojo.Parking_comeon;
import com.example.soph.utils.ServletUtils;
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
 * @Descriptioncom.example.soph.servlet.s8
 * @User XGKerwin
 * 添加加油记录
 */
@WebServlet(name = "SetParkingComeon", value = "/SetParkingComeon")
public class SetParking_comeon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int i = new ParkingDaoImpl().queryComeon(
                jsonObject.optString("oilVolume"),
                jsonObject.optString("money"),
                jsonObject.optString("mileage"),
                jsonObject.optString("oilPrice")
        );

        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1, i == 1);
        resp.getWriter().write(jsonObject1.toString());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
