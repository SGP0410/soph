package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/29 19:49
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.User;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
//注册
@WebServlet(name = "signIn", value = "/signIn")
public class SignIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        int i = new UserDaoImpl().addUser(new User(
                jsonObject.optString("username"),
                jsonObject.optString("nickName"),
                jsonObject.optString("phonenumber"),
                jsonObject.optString("sex"),
                jsonObject.optString("password")
        ));
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);
        response.getWriter().write(jsonObject1.toString());
    }
}
