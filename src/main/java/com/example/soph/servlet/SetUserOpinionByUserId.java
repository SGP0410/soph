package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 9:39
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.UserOpinion;
import com.example.soph.utils.ServletUtils;
import com.google.gson.Gson;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "setUserOpinionByUserId", value = "/setUserOpinionByUserId")
public class SetUserOpinionByUserId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        UserOpinion userOpinion = new Gson().fromJson(jsonObject.toString() , UserOpinion.class);
        int i = new UserDaoImpl().addUserOpinion(userOpinion);
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);
        response.getWriter().write(jsonObject1.toString());
    }
}
