package com.example.soph.servlet;

import com.example.soph.dao.impl.BusDaoImapl;
import com.example.soph.pojo.Bus;
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
 * @date 2021/3/31 20:16 星期三
 */

@WebServlet(name = "getbus",value = "/getbus")
public class GetBus extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Bus> busList = new BusDaoImapl().queryList();
        JSONObject jsonObject = new JSONObject();
        if (busList != null){
            ServletUtils.isOk(jsonObject,true);
            JSONArray jsonArray = new JSONArray(busList);
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