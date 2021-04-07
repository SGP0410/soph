package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 8:52
 */

import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "echarge", value = "/echarge")
public class Echarge extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , !(jsonObject.optString("balance").isEmpty()&&
                jsonObject.optString("userId").isEmpty()&&
                jsonObject.optString("id").isEmpty()&&
                jsonObject.optString("classifyId").isEmpty()));
        response.getWriter().write(jsonObject1.toString());
    }
}
