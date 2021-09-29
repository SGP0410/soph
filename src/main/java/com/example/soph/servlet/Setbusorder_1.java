package com.example.soph.servlet;

import com.example.soph.dao.impl.BusDaoImapl;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 关鑫
 * @date 2021/9/14 11:12 星期二
 * @Description com.example.soph.servlet
 */
@WebServlet(name = "setbusorder_msg", value = "/setbusorder_msg")
public class Setbusorder_1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        int s = (int) Math.floor((Math.random() * 100000000) + 1);

        int i = new BusDaoImapl().setbus_order_msg(
                s + "",
                jsonObject.optString("username"),
                jsonObject.optString("name"),
                jsonObject.optString("createTime"),
                jsonObject.optString("start"),
                jsonObject.optString("end"),
                jsonObject.optString("price"),
                jsonObject.optString("userTel"),
                jsonObject.optString("userId"),
                jsonObject.optString("status")
        );

        JSONObject jsonObject1 = new JSONObject();
        if (i == 1) {
            ServletUtils.isOk(jsonObject1, true);
        } else {
            ServletUtils.isOk(jsonObject1, false);
        }
        resp.getWriter().write(jsonObject1.toString());


    }
}
