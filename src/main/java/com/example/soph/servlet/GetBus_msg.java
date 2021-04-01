package com.example.soph.servlet;

import com.example.soph.dao.impl.BusDaoImapl;
import com.example.soph.pojo.Bus_msg;
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
 * @date 2021/3/31 20:24 星期三
 */

/**
 * 根据id查询巴士信息
 */
@WebServlet(name = "getbusmsg",value = "/getbusmsg")
public class GetBus_msg extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Bus_msg> bus_msgs = new BusDaoImapl().queryLinesId(jsonObject.optString("linesId"));
        JSONObject jsonObject1 = new JSONObject();
        if (bus_msgs != null){
            ServletUtils.isOk(jsonObject1,true);
            JSONArray jsonArray = new JSONArray(bus_msgs);
            jsonObject1.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());



    }
}
