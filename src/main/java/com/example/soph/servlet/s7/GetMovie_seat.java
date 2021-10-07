package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_seat;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.json.JsonArray;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/9/27 12:46 星期一
 * @Description com.example.soph.servlet.s7
 */
@WebServlet(name = "GetMovieseat", value = "/GetMovieseat")
public class GetMovie_seat extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Movie_seat> movie_seats = new Movie_infoDaoImpl().query_movie_seat(jsonObject.optString("seatNumber"));

        JSONObject jsonObject1 = new JSONObject();
        if (movie_seats != null) {
            jsonObject1.put("data", new JSONArray(movie_seats));
        }
        ServletUtils.isOk(jsonObject1, movie_seats != null);
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
