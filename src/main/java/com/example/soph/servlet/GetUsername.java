package com.example.soph.servlet;

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.User;
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
 * @date 2021/9/11 20:37 星期六
 * @Description com.example.soph.servlet
 */

@WebServlet(name = "Getuser",value = "/Getuser")
public class GetUsername extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<User> users = new UserDaoImpl().queryAll();
        JSONObject jsonObject1 = new JSONObject();
        if (users != null){
            ServletUtils.isOk(jsonObject1,true);
            JSONArray jsonArray = new JSONArray();
            for (User user : users) {
                JSONObject jsonObject = new JSONObject(user);
                jsonObject.put("avatar",ServletUtils.getImageUrl(req,user.getAvatar()));
                jsonArray.put(jsonObject);
            }
            jsonObject1.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
