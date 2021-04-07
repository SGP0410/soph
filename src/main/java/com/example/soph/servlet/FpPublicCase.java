package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 11:37
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.Fpcase;
import com.example.soph.utils.ServletUtils;
import com.google.gson.Gson;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "fpPublicCase", value = "/fpPublicCase")
public class FpPublicCase extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        Fpcase fpcase = new Gson().fromJson(jsonObject.toString(), Fpcase.class);
        int i = new FpDaoImpl().addFpcase(fpcase);
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);
        response.getWriter().write(jsonObject1.toString());
    }
}
