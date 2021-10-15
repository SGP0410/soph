package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.WrittenJudgement;
import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 关鑫
 * @date 2021/10/12 星期二
 * @Description com.example.soph.servlet.s9
 */
@WebServlet(name = "GetWrittenMsg", value = "/GetWrittenMsg")
public class GetWrittenMsg extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        WrittenJudgement number = null;
        number = new VehicleInformationBindingDaoImpl().querWritten(jsonObject.optString("number"));
        JSONObject jsonObject1 = new JSONObject(number);
        ServletUtils.isOk(jsonObject1, true);
        resp.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
