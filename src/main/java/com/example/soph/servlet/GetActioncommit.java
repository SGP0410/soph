package com.example.soph.servlet;

import com.example.soph.dao.impl.ActionsDaoImapl;
import com.example.soph.pojo.Actioncommit;
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
 * @date 2021/4/1 9:18 星期四
 */

/**
 * 通过新闻id获取活动评论
 * {"id":"12"}
 */

@WebServlet(name = "getactioncommit",value = "/getactioncommit")
public class GetActioncommit extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        List<Actioncommit> actioncommits = new ActionsDaoImapl().queryList(jsonObject.optString("id"));
        JSONObject jsonObject1 = new JSONObject();
        if (actioncommits != null){
            ServletUtils.isOk(jsonObject1,true);
            JSONArray jsonArray = new JSONArray(actioncommits);
            jsonObject1.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());

    }
}
