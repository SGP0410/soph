package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/31 20:46
 */

import com.example.soph.dao.impl.ParkingDaoImpl;
import com.example.soph.pojo.Parking;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getParkingAll", value = "/getParkingAll")
public class GetParkingAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<Parking> parkings = new ParkingDaoImpl().queryParkingAll();
        JSONObject jsonObject = new JSONObject();
        if (parkings != null){
            jsonObject.put("total" , parkings.size());
            for (Parking p:parkings) {
                p.setImgUrl(ServletUtils.getImageUrl(request , p.getImgUrl()));
            }
            jsonObject.put("rows" , new JSONArray(parkings));
        }
        ServletUtils.isOk(jsonObject , parkings != null);
        response.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
