package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_comment;
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
 * @date 2021/7/18 12:49 星期日
 */

/**
 * 查询所有评论
 */
@WebServlet(name = "GetMovieComment",value = "/GetMovieComment")
public class GetMovie_Comment extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject1 = ServletUtils.getJSONObject(req);

        List<Movie_comment> movie_comments = new Movie_infoDaoImpl().query_comment(jsonObject1.optString("Movieid"));
        for (Movie_comment movie_comment : movie_comments) {
            movie_comment.setImage(ServletUtils.getImageUrl(req,movie_comment.getImage()));
        }

        JSONObject jsonObject = new JSONObject();
        if (movie_comments != null){
            jsonObject.put("total",movie_comments.size());
            jsonObject.put("rows",new JSONArray(movie_comments));
        }
        ServletUtils.isOk(jsonObject,movie_comments != null);
        resp.getWriter().write(jsonObject.toString());



    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
