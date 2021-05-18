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
 * @date 2021/4/7 11:46 星期三
 */

@WebServlet(name = "setbusorder",value = "/setbusorder")
public class SetBus_order extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        System.out.println(jsonObject.toString());

        int a = new BusDaoImapl().setbus_order(
                jsonObject.optString("name"),
                jsonObject.optString("tel"),
                jsonObject.optString("userid"),
                jsonObject.optString("status"),
                jsonObject.optString("start"),
                jsonObject.optString("end"),
                new SimpleDateFormat("yyyy-MM-dd").format(new Date())
        );

        JSONObject jsonObject1 = new JSONObject();
        if (a == 1){
            ServletUtils.isOk(jsonObject1,true);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }
}
