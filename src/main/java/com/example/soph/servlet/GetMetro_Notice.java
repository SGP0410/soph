package com.example.soph.servlet;

import com.example.soph.dao.impl.MetroDaoImpl;
import com.example.soph.pojo.Metro_notice;
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
 * @date 2021/6/9 10:18 星期三
 */
@WebServlet(name = "getMetroNotice",value = "/getMetroNotice")
public class GetMetro_Notice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Metro_notice> notices = new MetroDaoImpl().queryNumber(jsonObject.optString("number"));
        JSONObject jsonObject1 = new JSONObject();
        if (notices != null){
            ServletUtils.isOk(jsonObject,true);
            JSONArray jsonArray = new JSONArray(notices);
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
