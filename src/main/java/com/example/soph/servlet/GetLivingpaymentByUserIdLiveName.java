package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 8:30
 */

import com.example.soph.dao.LivingpaymentDao;
import com.example.soph.dao.impl.LivingpaymentDaoImpl;
import com.example.soph.pojo.Livingpayment;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getLivingpaymentByUserIdLiveName", value = "/getLivingpaymentByUserIdLiveName")
public class GetLivingpaymentByUserIdLiveName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        LivingpaymentDaoImpl livingpaymentDao = new LivingpaymentDaoImpl();
        List<Livingpayment> livingpayments = null;
        if (!jsonObject.optString("liveName").isEmpty()){
            livingpayments = livingpaymentDao.queryLivingpaymentByUserIdLiveName(jsonObject.optString("userId"),
                    jsonObject.optString("liveName"));
        }else {
            livingpayments = livingpaymentDao.queryLivingpaymentByUserId(jsonObject.optString("userId"));
        }
        JSONObject jsonObject1 = new JSONObject();
        if (livingpayments != null){
            jsonObject1.put("total" , livingpayments.size());
            jsonObject1.put("rows" , new JSONArray(livingpayments));
        }
        ServletUtils.isOk(jsonObject1 , livingpayments != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
