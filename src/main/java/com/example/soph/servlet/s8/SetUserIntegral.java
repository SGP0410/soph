package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.UserWalletDaoImpl;
import com.example.soph.pojo.UserIntegral;
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
 * @date 2021/7/19 15:02 星期一
 */

/**
 * 积分记录
 */
@WebServlet(name = "SetUserIntegral",value = "/SetUserIntegral")
public class SetUserIntegral extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int a = new UserWalletDaoImpl().setIntegral(new UserIntegral(
                jsonObject.optString("id"),
                jsonObject.optInt("integral"),
                jsonObject.optString("way"),
                jsonObject.optString("userid"),
                jsonObject.optString("time"),
                jsonObject.optString("recording")));

        ServletUtils.isOk(jsonObject, a == 1);
        resp.getWriter().write(jsonObject.toString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
