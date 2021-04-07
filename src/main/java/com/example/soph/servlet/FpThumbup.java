package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 10:13
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "fpThumbup", value = "/fpThumbup")
public class FpThumbup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        int i = new FpDaoImpl().updateFpcaseThumbup(jsonObject.optString("caseid"));
        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);
        response.getWriter().write(jsonObject1.toString());
    }
}
