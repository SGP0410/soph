package com.example.soph.servlet;

import com.example.soph.dao.impl.MetroDaoImpl;
import com.example.soph.pojo.Metro_language;
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
 * @date 2021/9/13 18:58 星期一
 * @Description com.example.soph.servlet
 */
@WebServlet(name = "Get_Metro_language", value = "/Get_Metro_language")
public class Get_Metro_language extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<Metro_language> metro_languages = new MetroDaoImpl().queryMetro_language();
        JSONObject jsonObject = new JSONObject();
        if (metro_languages != null) {
            jsonObject.put("total", metro_languages.size());
            JSONArray jsonArray = new JSONArray();
            for (Metro_language metro_language : metro_languages) {
                JSONObject jsonObject1 = new JSONObject(metro_language);
                jsonObject1.put("image", ServletUtils.getImageUrl(req, metro_language.getImage()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("data", jsonArray);
        }

        ServletUtils.isOk(jsonObject, metro_languages != null);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
