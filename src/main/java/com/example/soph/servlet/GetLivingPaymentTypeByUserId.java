package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/7 10:21
 */

import com.example.soph.dao.impl.LivingpaymentDaoImpl;
import com.example.soph.pojo.LivingPaymentType;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getLivingPaymentTypeByUserId", value = "/getLivingPaymentTypeByUserId")
public class GetLivingPaymentTypeByUserId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<LivingPaymentType> livingPaymentTypes = new LivingpaymentDaoImpl()
                .queryLivingPaymentTypeByUserId(jsonObject.optString("userId"));
        JSONObject jsonObject1 = new JSONObject();
        if (livingPaymentTypes != null){
            jsonObject1.put("total" , livingPaymentTypes.size());
            jsonObject1.put("rows" , new JSONArray(livingPaymentTypes));
        }
        ServletUtils.isOk(jsonObject1 , livingPaymentTypes != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
