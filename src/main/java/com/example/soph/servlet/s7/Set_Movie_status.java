package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.Movie_status;
import com.example.soph.pojo.User;
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
 * @date 2021/7/18 13:52 星期日
 */

/**
 * 添加想看和看过
 */
@WebServlet(name = "SetMovieStatus",value = "/SetMovieStatus")
public class Set_Movie_status extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        System.out.println("1");
        List<Movie_status> movie_statuses = new Movie_infoDaoImpl().query_userid(jsonObject.optString("userid"));
        String movieid = jsonObject.optString("movieid");
        String status = jsonObject.optString("status");
        if (movie_statuses != null){
            for (Movie_status movie_status : movie_statuses) {
                if (movieid.equals(movie_status.getMovieid())){
                    if (status.equals(movie_status.getStatus())){
                        JSONObject jsonObject1 = new JSONObject();
                        jsonObject1.put("msg","重复添加");
                        jsonObject1.put("code","500");
                        resp.getWriter().write(jsonObject1.toString());
                        return;
                    }
                }
            }
        }

        System.out.println("2");

        User user = new UserDaoImpl().queryUserByUserId(jsonObject.optString("userid"));

        System.out.println(user);

        int i = new Movie_infoDaoImpl().add_status(new Movie_status(
                jsonObject.optString("id"),
                jsonObject.optString("movieid"),
                jsonObject.optString("status"),
                jsonObject.optString("userid"),
                jsonObject.optString("statusmsg"),
                user.getAvatar()
        ));

        ServletUtils.isOk(jsonObject , i == 1);
        resp.getWriter().write(jsonObject.toString());
    }
}
