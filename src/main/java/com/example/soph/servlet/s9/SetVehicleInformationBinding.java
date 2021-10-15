package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.VehicleInformationBinding;
import com.example.soph.pojo.ViolationCancellation;
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
 * @date 2021/7/24 11:26 星期六
 */

/**
 * 添加用户绑定信息
 */
@WebServlet(name = "SetVehicleInformationBinding", value = "/SetVehicleInformationBinding")
public class SetVehicleInformationBinding extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        int a = new VehicleInformationBindingDaoImpl().setVehicleInformationBinding(new VehicleInformationBinding(
                jsonObject.optString("id"),
                jsonObject.optString("userId"),
                jsonObject.optString("type"),
                jsonObject.optString("number"),
                jsonObject.optString("effectiveDate"),
                jsonObject.optString("idCard")
        ));


        ServletUtils.isOk(jsonObject, a == 1);
        resp.getWriter().write(jsonObject.toString());

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
