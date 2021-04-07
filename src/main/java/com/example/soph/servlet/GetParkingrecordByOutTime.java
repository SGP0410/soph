package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/31 21:21
 */

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

@WebServlet(name = "getParkingrecordByOutTime", value = "/getParkingrecordByOutTime")
public class GetParkingrecordByOutTime extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<Parkingrecord> parkingrecords = new ParkingDaoImpl().queryParkingrecordByOutTime(jsonObject.optString("outTime"));
        JSONObject jsonObject1 = new JSONObject();
        if (parkingrecords != null){
            jsonObject1.put("total" , parkingrecords.size());
            jsonObject1.put("rows" , new JSONArray(parkingrecords));
        }
        ServletUtils.isOk(jsonObject1 , parkingrecords != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
