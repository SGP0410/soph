package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_add;
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
 * @date 2021/7/18 17:28 星期日
 */

/**
 * 查询影院地址
 */
@WebServlet(name = "GetMovieAdd",value = "/GetMovieAdd")
public class Get_Movie_add extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Movie_add> adds = new Movie_infoDaoImpl().query_add();
        JSONObject jsonObject = new JSONObject();
        if (adds != null){
            jsonObject.put("total",adds.size());
            JSONArray jsonArray = new JSONArray();
            for (Movie_add movie_new : adds) {
                JSONObject jsonObject1 = new JSONObject(movie_new);
                jsonObject1.put("img",ServletUtils.getImageUrl(req,movie_new.getImg()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }
        ServletUtils.isOk(jsonObject,adds != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
