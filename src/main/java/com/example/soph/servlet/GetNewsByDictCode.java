package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 15:59
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

@WebServlet(name = "getNewsByDictCode", value = "/getNewsByDictCode")
public class GetNewsByDictCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<News> newsList = new NewsDaoImpl().queryNewsByDictCode(jsonObject.optString("dictCode"));
        JSONObject jsonObject1 = new JSONObject();
        if (newsList != null){
            jsonObject1.put("total" , newsList.size());
            for (News n:newsList) {
                n.setImgUrl(ServletUtils.getImageUrl(request , n.getImgUrl()));
            }
            jsonObject1.put("rows" , new JSONArray(newsList));
        }
        ServletUtils.isOk(jsonObject1 , newsList != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
