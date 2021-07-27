package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Apply_revocation;
import com.example.soph.utils.ServletUtils;
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
 * @date 2021/7/24 16:15 星期六
 */

@WebServlet(name = "SetApplyRevocation",value = "/SetApplyRevocation")
public class SetApply_revocation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int a = new VehicleInformationBindingDaoImpl().setApplyRevocation(new Apply_revocation(
                        jsonObject.optString("id"),
                        jsonObject.optString("endorsementId"),
                        jsonObject.optString("cause"),
                        jsonObject.optString("time"),
                        jsonObject.optString("type")
                )
        );
        ServletUtils.isOk(jsonObject, a == 1);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
