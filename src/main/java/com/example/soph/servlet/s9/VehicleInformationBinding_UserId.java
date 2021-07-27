package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.VehicleInformationBinding;
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
 * @date 2021/7/24 10:57 星期六
 */

/**
 * 根据用户id查询绑定车辆
 */
@WebServlet(name = "GetVehicleInformationBinding_UserId",value = "/GetVehicleInformationBinding_UserId")
public class VehicleInformationBinding_UserId extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<VehicleInformationBinding> bindingList = new VehicleInformationBindingDaoImpl().query_id(jsonObject.optString("userId"));
        JSONObject jsonObject1 = new JSONObject();
        if (bindingList != null){
            ServletUtils.isOk(jsonObject1,true);
            jsonObject1.put("rows",new JSONArray(bindingList));
        }
        ServletUtils.isOk(jsonObject1,bindingList != null);
        resp.getWriter().write(jsonObject1.toString());

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
