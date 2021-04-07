package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/5 19:06
 */

import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@WebServlet(name = "getDutyByDepartmentId", value = "/getDutyByDepartmentId")
public class GetDutyByDepartmentId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        String hospitalId = jsonObject.optString("hospitalId");
        String departmentId = jsonObject.optString("departmentId");
        JSONObject jsonObject1 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5)+ 5; i++) {
            JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("hospitalId" , hospitalId);
            jsonObject2.put("departmentId" , departmentId);
            jsonObject2.put("time" , new SimpleDateFormat("yyyy-M-d E HH:mm").format(new Date()));
            jsonObject2.put("type" , "普通门诊");
            jsonObject2.put("doctorId" , random.nextInt(50));
            jsonArray.put(jsonObject2);
        }
        jsonObject1.put("total" , jsonArray.length());
        jsonObject1.put("rows" , jsonArray);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
