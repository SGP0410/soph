package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Apply_revocation;
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
 * @date 2021/7/24 16:08 星期六
 */

@WebServlet(name = "GetApplyRevocation",value = "/GetApplyRevocation")
public class GetApply_revocation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Apply_revocation> apply_revocations = new VehicleInformationBindingDaoImpl().query_apply(
                jsonObject.optString("endorsementId"));
        JSONObject jsonObject1 = new JSONObject();
        if (apply_revocations != null){
            jsonObject1.put("total",apply_revocations.size());
            jsonObject1.put("rows",new JSONArray(apply_revocations));
        }
        ServletUtils.isOk(jsonObject1,apply_revocations != null);
        resp.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
