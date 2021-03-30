package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 8:50
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.UserOrder;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getOrderList", value = "/getOrderList")
public class GetOrderList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<UserOrder> userOrders = new UserDaoImpl().queryUserOrder();
        JSONObject jsonObject1 = new JSONObject();
        if (userOrders != null){
            jsonObject1.put("total" , userOrders.size());
            jsonObject1.put("rows" , new JSONArray(userOrders));
        }
        ServletUtils.isOk(jsonObject1 , userOrders != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
