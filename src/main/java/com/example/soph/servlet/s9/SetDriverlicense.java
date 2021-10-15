package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Driverlicense;
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
 * @date 2021/10/12 星期二
 * @Description com.example.soph.servlet.s9
 */
@WebServlet(name = "SetDriverlicense",value = "/SetDriverlicense")
public class SetDriverlicense extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int i = new VehicleInformationBindingDaoImpl().insertDriver(new Driverlicense(
                jsonObject.optString("id"),
                jsonObject.optString("userId"),
                jsonObject.optString("LicenseNumber"),
                jsonObject.optString("validPeriod"),
                jsonObject.optString("carid"),
                jsonObject.optString("msgs"),
                jsonObject.optString("msgss"),
                jsonObject.optString("msgsss")
        ));
        ServletUtils.isOk(jsonObject,i==1);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
