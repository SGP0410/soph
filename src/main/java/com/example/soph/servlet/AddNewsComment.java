package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 16:57
 */

import com.example.soph.dao.impl.NewsDaoImpl;
import com.example.soph.pojo.NewsComment;
import com.example.soph.utils.ExistToken;
import com.example.soph.utils.ServletUtils;
import com.google.gson.Gson;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addNewsComment", value = "/addNewsComment")
public class AddNewsComment extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        JSONObject jsonObject1 = new JSONObject();
        String token  = request.getHeader("Authorization");
        boolean isAble = new ExistToken().isVialable(token);
        if (isAble) {
            NewsComment newsComment = new Gson().fromJson(jsonObject.toString(), NewsComment.class);
            int i = new NewsDaoImpl().addNewsComment(newsComment);
            ServletUtils.isOk(jsonObject1, i == 1);
        }else {
            jsonObject1.put("msg","身份验证失败");
            jsonObject1.put("code", 403);
        }
        response.getWriter().write(jsonObject1.toString());
    }
}
