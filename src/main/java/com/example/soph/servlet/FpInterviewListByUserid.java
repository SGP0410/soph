package com.example.soph.servlet;

/**
 * @author 孙国鹏
 * @date 2021/4/1 11:14
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.FpinterView;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "fpInterviewListByUserid", value = "/fpInterviewListByUserid")
public class FpInterviewListByUserid extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<FpinterView> fpinterViews =
                new FpDaoImpl().queryFpinterViewByUserid(jsonObject.optString("userid"));
        JSONObject jsonObject1 = new JSONObject();
        if (fpinterViews != null){
            jsonObject1.put("total" , fpinterViews.size());
            jsonObject1.put("rows" , new JSONArray(fpinterViews));
        }
        ServletUtils.isOk(jsonObject1 , fpinterViews != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
