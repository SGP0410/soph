package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.NewsConsultingDaoImpl;
import com.example.soph.pojo.ConsultingNews;
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
 * @date 2021/9/29 15:22 星期三
 * @Description com.example.soph.servlet.s8
 */

@WebServlet(name = "Setnews", value = "/Setnews")
public class SetNewsnews extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        ConsultingNews id = new NewsConsultingDaoImpl().queryById(jsonObject.optString("id"));
        int like = Integer.parseInt(id.getLike());
        int i = new NewsConsultingDaoImpl().queryConsultin(like+1+"",id.getId());
        ServletUtils.isOk(jsonObject, i == 1);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
