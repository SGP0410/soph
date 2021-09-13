package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Consult;
import com.example.soph.pojo.Service_center;
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
 * @date 2021/7/24 17:27 星期六
 */

@WebServlet(name = "GetServiceCenter", value = "/GetServiceCenter")
public class GetService_center extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<Service_center> service_centers = new VehicleInformationBindingDaoImpl().query_Service_center();
        JSONObject jsonObject = new JSONObject();
        if (service_centers != null){
            jsonObject.put("total",service_centers.size());
            jsonObject.put("rows",new JSONArray(service_centers));
        }
        ServletUtils.isOk(jsonObject,service_centers != null);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
