package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/31 21:04
 */

import com.example.soph.dao.impl.ParkingDaoImpl;
import com.example.soph.pojo.Parkingrecord;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getParkingrecordAll", value = "/getParkingrecordAll")
public class GetParkingrecordAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<Parkingrecord> parkingrecords = new ParkingDaoImpl().queryParkingrecordAll();
        JSONObject jsonObject = new JSONObject();
        if (parkingrecords != null){
            jsonObject.put("total" , parkingrecords.size());
            jsonObject.put("rows" , new JSONArray(parkingrecords));
        }
        ServletUtils.isOk(jsonObject , parkingrecords != null);
        response.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
