package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_seat;
import com.example.soph.utils.ServletUtils;
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
 * @date 2021/9/27 13:03 星期一
 * @Description com.example.soph.servlet.s7
 */
@WebServlet(name = "SetMovie_seat", value = "/SetMovie_seat")
public class SetMovie_seat extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        List<Movie_seat> movie_seats = new Movie_infoDaoImpl().query_movie_seat(jsonObject.optString("seatNumber"));
        String session = jsonObject.optString("session");
        String seatNumber = jsonObject.optString("seatNumber");
        JSONObject jsonObject1 = new JSONObject();
        for (Movie_seat movie_seat : movie_seats) {
            if (session.equals(movie_seat.getSession())) {
                jsonObject1.put("msg", "重复添加");
                jsonObject1.put("code", "500");
                resp.getWriter().write(jsonObject1.toString());
                return;
            }
        }

        int i = new Movie_infoDaoImpl().addMovie_seat(new Movie_seat(
                jsonObject.optString("id"),
                seatNumber,
                session
        ));

        ServletUtils.isOk(jsonObject1, i == 1);
        resp.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
