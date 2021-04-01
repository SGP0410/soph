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
 * @date 2021/4/1 9:38 星期四
 */

/**
 * 获取所有活动内容
 */
@WebServlet(name = "getactions",value = "/getactions")
public class GetActions extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Actions> actions = new ActionsDaoImapl().queryList();
        JSONObject jsonObject = new JSONObject();
        if (actions != null){
            ServletUtils.isOk(jsonObject,true);
            JSONArray jsonArray = new JSONArray(actions);
            jsonObject.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
