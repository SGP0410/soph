package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
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
 * @date 2021/7/18 14:38 星期日
 */

/**
 * 通过影片id查询播放信息
 */
@WebServlet(name = "Get_Movie_session",value = "/Get_Movie_session")
public class Get_Movie_session extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Movie_session> movie_sessions = new Movie_infoDaoImpl().query_session(jsonObject.optString("Movieid"));
        JSONObject jsonObject1 = new JSONObject();
        if (movie_sessions != null){
            jsonObject1.put("total",movie_sessions.size());
            jsonObject1.put("rows",new JSONArray(movie_sessions));
        }
        ServletUtils.isOk(jsonObject1 , movie_sessions != null);
        resp.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
