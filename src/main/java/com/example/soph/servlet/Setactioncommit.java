package com.example.soph.servlet;

import com.example.soph.dao.impl.ActionsDaoImapl;
import com.example.soph.pojo.Actioncommit;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/4/1 10:00 星期四
 */

/**
 * 提交活动评论
 */
@WebServlet(name = "setactioncommit",value = "/setactioncommit")
public class Setactioncommit extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        int a = new ActionsDaoImapl().setqueryActionscommit(jsonObject.optString("id"),
                jsonObject.optString("userid"),
                jsonObject.optString("commitTime"),
                jsonObject.optString("commitContent"));

        if (a == 1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
