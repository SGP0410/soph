package com.example.soph.servlet;

import com.example.soph.dao.impl.BusDaoImapl;
import com.example.soph.pojo.Bus;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/4/1 11:01 星期四
 */

/**
 * 通过linesId获取详细信息
 */
@WebServlet(name = "getbusid",value = "/getbusid")
public class GetBusId extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        Bus bus = new BusDaoImapl().queryBusId(jsonObject.optString("linesId"));
        JSONObject jsonObject1 = new JSONObject(bus);
        if (bus != null){
            ServletUtils.isOk(jsonObject1,true);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
