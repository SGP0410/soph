package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.VehicleInformationBinding;
import com.example.soph.pojo.ViolationCancellation;
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
 * @date 2021/10/11 星期一
 * @Description com.example.soph.servlet.s9
 */
@WebServlet(name = "SetRevocationOfViolation", value = "/SetRevocationOfViolation")
public class SetRevocationOfViolation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        List<ViolationCancellation> violationCancellations = new VehicleInformationBindingDaoImpl().queryCancellationAll();
        String number = jsonObject.optString("number");
        for (ViolationCancellation violationCancellation : violationCancellations) {
            if (number.equals(violationCancellation.getNumber())){
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("msg1","此单号已申请");
                ServletUtils.isOk(jsonObject1,false);
                resp.getWriter().write(jsonObject1.toString());
                System.out.println("已申请");
                return;
            }
        }
        System.out.println("未申请");

        int i = new VehicleInformationBindingDaoImpl().addViolation_cancellation(new ViolationCancellation(
                jsonObject.optString("id"),
                jsonObject.optString("cph"),
                jsonObject.optString("number"),
                jsonObject.optString("times"),
                jsonObject.optString("types"),
                jsonObject.optString("behavior"),
                jsonObject.optString("address"),
                jsonObject.optString("punishmenttime")
        ));
        ServletUtils.isOk(jsonObject,i==1);
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
