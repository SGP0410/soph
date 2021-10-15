package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Driverlicense;
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
 * @date 2021/10/12 星期二
 * @Description com.example.soph.servlet.s9
 */
@WebServlet(name = "GetDriverlicense", value = "/GetDriverlicense")
public class GetDriverlicense extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Driverlicense> driverlicenses = new VehicleInformationBindingDaoImpl().queryDriver(jsonObject.optString("userId"));
        JSONObject jsonObject1 = new JSONObject();
        if (driverlicenses != null) {
            jsonObject1.put("rows", new JSONArray(driverlicenses));
        }
        ServletUtils.isOk(jsonObject1, driverlicenses != null);
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
