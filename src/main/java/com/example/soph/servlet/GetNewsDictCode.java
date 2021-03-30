package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 16:06
 */

import com.example.soph.dao.impl.NewsDaoImpl;
import com.example.soph.pojo.NewsType;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getNewsDictCode", value = "/getNewsDictCode")
public class GetNewsDictCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<NewsType> newsTypes = new NewsDaoImpl().queryNewsType();
        JSONObject jsonObject1 = new JSONObject();
        if (newsTypes != null){
            jsonObject1.put("total" , newsTypes.size());
            jsonObject1.put("rows" , new JSONArray(newsTypes));
        }
        ServletUtils.isOk(jsonObject1 , newsTypes != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
