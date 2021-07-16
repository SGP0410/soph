package com.example.soph.servlet;

import com.example.soph.dao.impl.MetroDaoImpl;
import com.example.soph.pojo.Metro_theme;
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
 * @date 2021/6/9 11:27 星期三
 */

/**
 * 查询列车主题
 */
@WebServlet(name = "getMetroTheme",value = "/getMetroTheme")
public class GetMetroTheme extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Metro_theme> metro_themes = new MetroDaoImpl().query_them();
        JSONObject jsonObject = new JSONObject();
        if (metro_themes != null){
            JSONArray jsonArray = new JSONArray();
            for (Metro_theme metro_theme : metro_themes) {
                JSONObject jsonObject1 = new JSONObject(metro_theme);
                jsonObject1.put("subpic",ServletUtils.getImageUrl(req,metro_theme.getSubpic()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }
        ServletUtils.isOk(jsonObject,metro_themes != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
