package com.example.soph.servlet;

import com.example.soph.dao.impl.ActionsDaoImapl;
import com.example.soph.pojo.Actions;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
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
 * @date 2021/4/1 9:42 星期四
 */

/**
 * 通过id获取活动
 */
@WebServlet(name = "getactionsid",value = "/getactionsid")
public class GetActionsId extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        Actions actions = new ActionsDaoImapl().queryListid(jsonObject.optString("id"));
        actions.setImage(ServletUtils.getImageUrl(req , actions.getImage()));
        JSONObject jsonObject1 = new JSONObject(actions);
        if (actions != null){
            ServletUtils.isOk(jsonObject1,true);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
