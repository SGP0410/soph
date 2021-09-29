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
import java.util.*;

/**
 * @author 关鑫
 * @date 2021/9/27 10:12 星期一
 * @Description com.example.soph.servlet.s7
 */

@WebServlet(name = "GetMovieName", value = "/GetMovieName")
public class GetMovieName extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Movie_session> movieName = new Movie_infoDaoImpl().query_title_name(jsonObject.optString("MovieName"));

        List<Movie_add> movie_adds = new Movie_infoDaoImpl().query_add();

        Map<String, Movie_session> map = new HashMap<>();
        for (Movie_session movie_session : movieName) {
            map.put(movie_session.getMovietitle(), movie_session);
        }

        Collection<Movie_session> values = map.values();

        List<Movie_session> sessions = new ArrayList<>(values);

        for (Movie_add movie_add : movie_adds) {
            for (Movie_session session : sessions) {
                if (session.getMovietitle().equals(movie_add.getMovietitle())){
                    session.setAddress(movie_add.getAddress());
                    continue;
                }
            }
        }


        jsonObject.put("data", new JSONArray(sessions));
        ServletUtils.isOk(jsonObject, movieName != null);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
