package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.NewsConsultingDaoImpl;
import com.example.soph.pojo.ConsultingNews;
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
 * @date 2021/9/29 15:06 星期三
 * @Description com.example.soph.servlet.s8
 */
@WebServlet(name = "Getnews", value = "/Getnews")
public class GetNewsnews extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<ConsultingNews> consultingNews = new NewsConsultingDaoImpl().queryAll();
        JSONObject jsonObject = new JSONObject();
        if (consultingNews != null) {
            for (ConsultingNews consultingNew : consultingNews) {
                consultingNew.setCover(ServletUtils.getImageUrl(req, consultingNew.getCover()));
            }
            jsonObject.put("total", consultingNews.size());
            jsonObject.put("rows", new JSONArray(consultingNews));
            ServletUtils.isOk(jsonObject, true);
        } else {
            ServletUtils.isOk(jsonObject, false);
        }
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
