package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/29 19:43
 */

import com.example.soph.dao.impl.TokenDao;
import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.MyToken;
import com.example.soph.pojo.User;
import com.example.soph.utils.ServletUtils;
import com.example.soph.utils.UtilToken;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {

    private String token;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        User user = new UserDaoImpl().queryUserByUsernamePassword(jsonObject.optString("username"),
                jsonObject.optString("password"));
        JSONObject jsonObject1 = new JSONObject();
        if (user != null) {
            token = UtilToken.generateValue(
                    System.currentTimeMillis() + "---" + user.getUsername() + "---" + System.currentTimeMillis() +
                            "---" + user.getPassword() + System.currentTimeMillis());
        }

        if (user != null) {
            jsonObject1.put("userId", user.getUserId());
            jsonObject1.put("token", token);
            int a = new TokenDao().addToken(token);
            List<MyToken> myTokens = new TokenDao().selectToken();
            if (myTokens.size() > 20) {
                new TokenDao().deleteToken();
            }
        }

        ServletUtils.isOk(jsonObject1, user != null);

        response.getWriter().write(jsonObject1.toString());

    }
}
