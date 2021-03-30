package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 9:21
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.UserOpinion;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getUserOpinionByUserId", value = "/getUserOpinionByUserId")
public class GetUserOpinionByUserId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<UserOpinion> userOpinions = new UserDaoImpl().queryUserOpinionByUserId(jsonObject.optString("userId"));
        JSONObject jsonObject1 = new JSONObject();
        if (userOpinions != null){
            jsonObject1.put("total" , userOpinions.size());
            jsonObject1.put("rows" , new JSONArray(userOpinions));
        }
        ServletUtils.isOk(jsonObject1 , userOpinions != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
