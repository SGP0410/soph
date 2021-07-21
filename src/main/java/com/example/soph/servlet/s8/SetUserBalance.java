package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.UserWalletDaoImpl;
import com.example.soph.pojo.UserRechargeRecord;
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
 * @date 2021/7/19 14:15 星期一
 */

/**
 * 余额记录
 */
@WebServlet(name = "SetUserBalance" , value = "/SetUserBalance")
public class SetUserBalance extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int a = new UserWalletDaoImpl().setMoney(new UserRechargeRecord(
                jsonObject.optString("id"),
                jsonObject.optInt("recharge_amount"),
                jsonObject.optString("time"),
                jsonObject.optString("recharge_method"),
                jsonObject.optString("userid"),
                jsonObject.optString("way")
                ));

        if (a == 1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
