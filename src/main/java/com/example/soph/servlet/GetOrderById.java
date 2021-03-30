package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 9:03
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.UserOrder;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "getOrderById", value = "/getOrderById")
public class GetOrderById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        UserOrder userOrder = new UserDaoImpl().queryUserOrderById(jsonObject.optString("id"));
        JSONObject jsonObject1 = null;
        if (userOrder != null){
            jsonObject1 = new JSONObject(userOrder);
        }else {
            jsonObject1 = new JSONObject();
        }
        ServletUtils.isOk(jsonObject1 , userOrder != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
