package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/31 20:54
 */

import com.example.soph.dao.impl.ParkingDaoImpl;
import com.example.soph.pojo.Parking;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "getParkingByParkingid", value = "/getParkingByParkingid")
public class GetParkingByParkingid extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        Parking parking = new ParkingDaoImpl().queryParkingByParkingid(jsonObject.optString("parkingid"));
        JSONObject jsonObject1 = new JSONObject();
        if (parking != null){
            parking.setImgUrl(ServletUtils.getImageUrl(request , parking.getImgUrl()));
            jsonObject1.put("data" , new JSONObject(parking));
        }
        ServletUtils.isOk(jsonObject1 , parking != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
