package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.ParkingDaoImpl;
import com.example.soph.pojo.Parkingrecord;
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
 * @date 2021/10/6 星期三
 * @Descriptioncom.example.soph.servlet.s8
 * @User XGKerwin
 */

/**
 * 通过车牌号查询停车位置信息
 */
@WebServlet(name = "Getplate", value = "/Getplate")
public class GetPlate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Parkingrecord> plateNumber = new ParkingDaoImpl().queryPlate(jsonObject.optString("plateNumber"));
        JSONObject jsonObject1 = new JSONObject();
        if (plateNumber != null) {
            jsonObject1.put("total",plateNumber.size());
            jsonObject1.put("rows",new JSONArray(plateNumber));
        }
        ServletUtils.isOk(jsonObject1,plateNumber!=null);
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
