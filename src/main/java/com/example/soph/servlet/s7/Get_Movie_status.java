package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_status;
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
 * @date 2021/7/18 13:48 星期日
 */

/**
 * 查询想看和看过 1看过 2 想看
 */
@WebServlet(name = "Get_Movie_status",value = "/Get_Movie_status")
public class Get_Movie_status extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Movie_status> movie_statuses = new Movie_infoDaoImpl().query_status();
        JSONObject jsonObject = new JSONObject();
        if (movie_statuses != null){
            jsonObject.put("total",movie_statuses.size());
            jsonObject.put("rows",new JSONArray(movie_statuses));
        }
        ServletUtils.isOk(jsonObject , movie_statuses != null);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
