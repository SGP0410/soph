package com.example.soph.dao.impl;

import com.example.soph.pojo.WrittenJudgement;
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
 * @date 2021/10/12 星期二
 * @Description com.example.soph.dao.impl
 */
@WebServlet(name = "SetWrittenViolationDate", value = "/SetWrittenViolationDate")
public class SetWrittenViolationDate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int i = new VehicleInformationBindingDaoImpl().updateWitten(new WrittenJudgement(jsonObject.optString("id"), jsonObject.optString("violationDate")));
        ServletUtils.isOk(jsonObject, i == 1);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
