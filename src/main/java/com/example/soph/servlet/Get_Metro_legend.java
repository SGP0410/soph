package com.example.soph.servlet;

import com.example.soph.dao.impl.MetroDaoImpl;
import com.example.soph.pojo.Metro_legend;
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
 * @date 2021/9/13 19:49 星期一
 * @Description com.example.soph.servlet
 */
@WebServlet(name = "Get_Metro_legend",value = "/Get_Metro_legend")
public class Get_Metro_legend extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<Metro_legend> metro_legends = new MetroDaoImpl().queryMetroLegend();
        JSONObject jsonObject = new JSONObject();
        if (metro_legends != null) {
            jsonObject.put("total",metro_legends.size());
            JSONArray jsonArray = new JSONArray();
            for (Metro_legend metro_legend : metro_legends) {
                JSONObject jsonObject1 = new JSONObject(metro_legend);
                jsonObject1.put("image",ServletUtils.getImageUrl(req,metro_legend.getImage()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }
        ServletUtils.isOk(jsonObject,metro_legends!=null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
