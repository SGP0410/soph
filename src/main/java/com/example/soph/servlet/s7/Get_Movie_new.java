package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_new;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.json.Json;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/18 15:09 星期日
 */

/**
 * 获取所有新闻信息
 */
@WebServlet(name = "GetMovieNew",value = "/GetMovieNew")
public class Get_Movie_new extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Movie_new> movie_news = new Movie_infoDaoImpl().query_news();
        JSONObject jsonObject = new JSONObject();
        if (movie_news != null){
            jsonObject.put("total",movie_news.size());
            JSONArray jsonArray = new JSONArray();
            for (Movie_new movie_new : movie_news) {
                JSONObject jsonObject1 = new JSONObject(movie_new);
                jsonObject1.put("img",ServletUtils.getImageUrl(req,movie_new.getImg()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }
        ServletUtils.isOk(jsonObject,movie_news != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }






}
