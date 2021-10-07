package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.ParkingDaoImpl;
import com.example.soph.pojo.Parking_comeon;
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
@WebServlet(name = "GetParkingComeonall", value = "/GetParkingComeonall")
public class GetParking_comeon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<Parking_comeon> parking_comeons = new ParkingDaoImpl().queryComeonall();
        JSONObject jsonObject = new JSONObject();
        if (parking_comeons != null) {
            jsonObject.put("total", parking_comeons.size());
            jsonObject.put("rows", new JSONArray(parking_comeons));
        }
        ServletUtils.isOk(jsonObject, parking_comeons != null);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
