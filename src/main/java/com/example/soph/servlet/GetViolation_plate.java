package com.example.soph.servlet;

import com.example.soph.dao.impl.ViolationDaoImapl;
import com.example.soph.pojo.Violation_plate;
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
 * @date 2021/3/31 21:26 星期三
 */

/**
 * 查询所有车牌区号
 */
@WebServlet(name = "getviolationplate",value = "/getviolationplate")
public class GetViolation_plate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Violation_plate> plates = new ViolationDaoImapl().queryPlate();
        JSONObject jsonObject = new JSONObject();
        if (plates != null){
            ServletUtils.isOk(jsonObject,true);
            JSONArray jsonArray = new JSONArray(plates);
            jsonObject.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());
    }
}
