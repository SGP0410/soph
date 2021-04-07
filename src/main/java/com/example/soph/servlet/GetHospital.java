package com.example.soph.servlet;

import com.example.soph.dao.impl.HospitalDaoImpl;
import com.example.soph.pojo.Hospital;
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
 * @date 2021/3/30 21:00 星期二
 */

/**
 * 获取所有医院列表
 */

@WebServlet(name = "gethospitel", value = "/gethospitel")
public class GetHospital extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Hospital> hospitals = new HospitalDaoImpl().queryHospitalList();
        JSONObject jsonObject = new JSONObject();
        if (hospitals != null){
            ServletUtils.isOk(jsonObject,true);
            jsonObject.put("total",hospitals.size());
            for (Hospital h:hospitals) {
                h.setImgUrl(ServletUtils.getImageUrl(req , h.getImgUrl()));
            }
            JSONArray jsonArray = new JSONArray(hospitals);
            jsonObject.put("rowa",jsonArray);
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
