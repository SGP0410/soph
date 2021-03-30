package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 8:19
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.User;
import com.example.soph.utils.ServletUtils;
import com.google.gson.Gson;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "upDataPassword", value = "/upDataPassword")
public class UpDataPassword extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        User user = new Gson().fromJson(jsonObject.toString(), User.class);
        int i = new UserDaoImpl().updatePassword(user);
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);
        response.getWriter().write(jsonObject1.toString());
    }
}
