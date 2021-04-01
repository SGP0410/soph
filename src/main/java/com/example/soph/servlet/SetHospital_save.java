package com.example.soph.servlet;

import com.example.soph.dao.impl.HospitalDaoImpl;
import com.example.soph.utils.ServletUtils;
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
 * @date 2021/3/31 20:03 星期三
 */

/**
 * 保存就诊信息
 */

@WebServlet(name = "sethospitalsave",value = "/sethospitalsave")
public class SetHospital_save extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        int a = new HospitalDaoImpl().setquerylsitsave(
                jsonObject.optString("carid"),
                jsonObject.optString("patientName"),
                jsonObject.optString("tel"),
                jsonObject.optString("doc"),
                jsonObject.getString("startime"),
                jsonObject.optString("moeny"),
                jsonObject.optString("userId")
        );

        if (a == 1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());

    }
}
