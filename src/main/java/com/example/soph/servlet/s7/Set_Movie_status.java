package com.example.soph.servlet.s7;

import com.example.soph.dao.impl.Movie_infoDaoImpl;
import com.example.soph.pojo.Movie_status;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/7/18 13:52 星期日
 */

/**
 * 添加想看和看过
 */
@WebServlet(name = "Set_Movie_status",value = "/Set_Movie_status")
public class Set_Movie_status extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int i = new Movie_infoDaoImpl().add_status(new Movie_status(
                jsonObject.optString("id"),
                jsonObject.optString("movieid"),
                jsonObject.optString("status"),
                jsonObject.optString("username"),
                jsonObject.optString("statusmsg")
        ));
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);
        resp.getWriter().write(jsonObject1.toString());
    }
}
