package com.example.soph.servlet;

import com.example.soph.dao.impl.MetroDaoImpl;
import com.example.soph.pojo.Metro;
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
 * @date 2021/6/9 8:51 星期三
 */

/**
 * 查询所有地铁数据
 */
@WebServlet(name = "getMetroQuery", value = "/getMetroQuery")
public class GetMetroQuery extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Metro> metroList = new MetroDaoImpl().query();
        JSONObject jsonObject = new JSONObject();
        if (metroList != null){
            JSONArray jsonArray = new JSONArray();
            for (Metro metro : metroList) {
                JSONObject jsonObject1 = new JSONObject(metro);
                jsonObject1.put("img",ServletUtils.getImageUrl(req,metro.getImg()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }
        ServletUtils.isOk(jsonObject,metroList != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
