package com.example.soph.servlet.s7;

/**
 * @author 关鑫
 * @date 2021/7/18 11:29 星期日
 */

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_info;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 获取所有影片信息
 */
@WebServlet(name = "getMovieInfo",value = "/getMovieInfo")
public class Get_Movie_Info extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<Movie_info> movie_infos = new Movie_infoDaoImpl().queryInfo();
        JSONObject jsonObject = new JSONObject();
        if (movie_infos != null) {
            jsonObject.put("total",movie_infos.size());
            JSONArray jsonArray = new JSONArray();
            for (Movie_info movie_info : movie_infos) {
                JSONObject jsonObject1 = new JSONObject(movie_info);
                jsonObject1.put("Moviecover",ServletUtils.getImageUrl(req,movie_info.getMoviecover()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }
        ServletUtils.isOk(jsonObject , movie_infos != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
