package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 16:47
 */

import com.example.soph.dao.impl.NewsDaoImpl;
import com.example.soph.pojo.NewsComment;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getNewsCommentByPressId", value = "/getNewsCommentByPressId")
public class GetNewsCommentByPressId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<NewsComment> newsComments = new NewsDaoImpl()
                .queryNewsCommentByPressId(jsonObject.optString("pressId"));
        JSONObject jsonObject1 = new JSONObject();
        if (newsComments != null){
            jsonObject1.put("total" , newsComments.size());
            jsonObject1.put("rows" , new JSONArray(newsComments));
        }
        ServletUtils.isOk(jsonObject1 , newsComments != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
