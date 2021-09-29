package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_add;
import com.example.soph.pojo.Movie_session;
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
 * @author 关鑫
 * @date 2021/9/27 7:31 星期一
 * @Description com.example.soph.servlet.s7
 */
@WebServlet(name = "GetSessionTitle",value = "/GetSessionTitle")
public class GetMovie_session_title extends HttpServlet {

    private String add = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Movie_add> movie_adds = new Movie_infoDaoImpl().query_add();

        String s = jsonObject.optString("Movietitle");

        for (Movie_add movie_add : movie_adds) {
            if (movie_add.getMovietitle().equals(s)){
                System.out.println(movie_add.getAddress());
                add = movie_add.getAddress();
                break;
            }
        }

        List<Movie_session> movie_sessions = new Movie_infoDaoImpl().query_title_name(jsonObject.optString("Movietitle"), jsonObject.optString("MovieName"));

        JSONObject jsonObject1 = new JSONObject();

        if (movie_sessions != null) {
            jsonObject1.put("data", new JSONArray(movie_sessions));
            jsonObject1.put("add", add);
        }

        ServletUtils.isOk(jsonObject1, movie_sessions != null);
        resp.getWriter().write(jsonObject1.toString());

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
