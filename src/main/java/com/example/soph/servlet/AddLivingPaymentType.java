package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 8:46
 */

import com.example.soph.dao.impl.LivingpaymentDaoImpl;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addLivingPaymentType", value = "/addLivingPaymentType")
public class AddLivingPaymentType extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        int i = new LivingpaymentDaoImpl().addLivingPaymentType(jsonObject.optString("typeName"),
                jsonObject.optString("userId"));
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);
        response.getWriter().write(jsonObject1.toString());
    }
}
