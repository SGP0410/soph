package com.example.soph.servlet;

import com.example.soph.dao.impl.ActionsDaoImapl;
import com.example.soph.pojo.Actiontype;
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
 * @date 2021/4/1 10:42 星期四
 */
@WebServlet(name = "gettypename",value = "/gettypename")
public class GetTypeName extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Actiontype> actiontypes = new ActionsDaoImapl().queryTypeList();
        JSONObject jsonObject1 = new JSONObject();
        if (actiontypes != null){
            ServletUtils.isOk(jsonObject1,true);
            JSONArray jsonArray = new JSONArray(actiontypes);
            jsonObject1.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
