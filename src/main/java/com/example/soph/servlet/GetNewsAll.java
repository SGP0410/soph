package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 16:32
 */

import com.example.soph.dao.impl.NewsDaoImpl;
import com.example.soph.pojo.News;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getNewsAll", value = "/getNewsAll")
public class GetNewsAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<News> news = new NewsDaoImpl().queryNewsAll();
        JSONObject jsonObject1 = new JSONObject();
        if (news != null){
            jsonObject1.put("total" , news.size());
            jsonObject1.put("rows" , new JSONArray(news));
        }
        ServletUtils.isOk(jsonObject1 , news != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
