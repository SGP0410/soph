package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.UserDaoImpl;
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
 * @date 2021/10/10 星期日
 * @Description com.example.soph.servlet.s9
 */
@WebServlet(name = "SetUsersalt", value = "/SetUsersalt")
public class SetUsersalt extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int i = new UserDaoImpl().updateSalt(jsonObject.optString("userId"), jsonObject.optString("salt"));

        ServletUtils.isOk(jsonObject, i == 1);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
