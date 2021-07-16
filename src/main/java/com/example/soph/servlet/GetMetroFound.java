package com.example.soph.servlet;

import com.example.soph.dao.impl.MetroDaoImpl;
import com.example.soph.pojo.Metrofound;
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
 * @date 2021/6/9 11:46 星期三
 */

/**
 * 失物招领
 */

@WebServlet(name = "getMetroFound",value = "/getMetroFound")
public class GetMetroFound extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Metrofound> metrofounds = new MetroDaoImpl().query_found();
        JSONObject jsonObject = new JSONObject();
        if (metrofounds != null){
            ServletUtils.isOk(jsonObject,true);
            JSONArray jsonArray = new JSONArray(metrofounds);
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
