package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.Movie_comment;
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
 * @date 2021/7/18 12:59 星期日
 */

/**
 * 添加评论
 */
@WebServlet(name = "SetMovieComment",value = "/SetMovieComment")
public class SetMovie_Comment extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

/*        List<Movie_comment> movieid = new Movie_infoDaoImpl().query_Movieid(jsonObject.optString("Movieid"));
        String userId = jsonObject.optString("userId");
        for (Movie_comment movie_comment : movieid) {
            if (userId.equals(movie_comment.getUserId())) {
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("msg", "重复提交");
                jsonObject1.put("code", "200");
                resp.getWriter().write(jsonObject1.toString());
                return;
            }
        }*/

        User user = new UserDaoImpl().queryUserByUserId(jsonObject.optString("userId"));

        String s = (int) Math.floor((Math.random()*10000)+1)+"";

        int i = new Movie_infoDaoImpl().add_comment(new Movie_comment(
                jsonObject.optString("id"),
                jsonObject.optString("Movieid"),
                jsonObject.optString("mark"),
                jsonObject.optString("conment"),
                jsonObject.optString("conmentTime"),
                jsonObject.optString("userId"),
                user.getAvatar(),
                user.getUsername(),
                s
        ));

        ServletUtils.isOk(jsonObject , i == 1);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }



}