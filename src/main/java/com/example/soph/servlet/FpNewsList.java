package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 10:03
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.FpNews;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "fpNewsList", value = "/fpNewsList")
public class FpNewsList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<FpNews> fpNews = new FpDaoImpl().queryFpNewsAll();
        JSONObject jsonObject = new JSONObject();
        if (fpNews != null){
            jsonObject.put("total" , fpNews.size());
            for (FpNews f:fpNews) {
                f.setNewspicture(ServletUtils.getImageUrl(request , f.getNewspicture()));
            }
            jsonObject.put("rows" , new JSONArray(fpNews));
        }
        ServletUtils.isOk(jsonObject , fpNews != null);
        response.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
