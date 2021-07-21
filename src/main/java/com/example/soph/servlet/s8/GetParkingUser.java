package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.ParkingDaoImpl;
import com.example.soph.pojo.Parking_User;
import com.example.soph.utils.ServletUtils;
import com.sun.xml.internal.ws.model.ParameterImpl;
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
 * @date 2021/7/19 10:40 星期一
 */

@WebServlet(name = "GetParkingUser",value = "/GetParkingUser")
public class GetParkingUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Parking_User> parking_users = new ParkingDaoImpl().queryParkingUser();
        JSONObject jsonObject = new JSONObject();
        if (parking_users != null){
            jsonObject.put("total",parking_users.size());
            jsonObject.put("rows",new JSONArray(parking_users));
        }
        ServletUtils.isOk(jsonObject,parking_users != null);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
