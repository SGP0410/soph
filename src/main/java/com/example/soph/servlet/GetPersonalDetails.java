package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/29 20:09
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.User;
import com.example.soph.utils.ExistToken;
import com.example.soph.utils.ServletUtils;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "getPersonalDetails", value = "/getPersonalDetails")
public class GetPersonalDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        UserDaoImpl userDao = new UserDaoImpl();
        String userId = request.getParameter("userId");
        User user = userDao.queryUserByUserId(userId);
        JSONObject jsonObject1 = null;
        String token = request.getHeader("Authorization");
        boolean isAble = new ExistToken().isVialable(token);
        if (isAble) {
            if (user != null) {
                jsonObject1 = new JSONObject(user);
                jsonObject1.remove("password");
                jsonObject1.put("avatar", ServletUtils.getImageUrl(request, user.getAvatar()));
                jsonObject1.put("dept", new JSONArray(userDao.queryUserDutyByUserId(user.getUserId())));
            } else {
                jsonObject1 = new JSONObject();
            }
            ServletUtils.isOk(jsonObject1, user != null);
        }else {
            jsonObject1 = new JSONObject();
            jsonObject1.put("msg","身份验证失败");
            jsonObject1.put("code", 403);
        }
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
