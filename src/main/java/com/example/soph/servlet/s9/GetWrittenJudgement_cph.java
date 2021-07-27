package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.WrittenJudgement;
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
 * @date 2021/7/24 12:56 星期六
 */

/**
 * 通过车牌号获取违章信息
 */
@WebServlet(name = "GetWrittenJudgementCph", value = "/GetWrittenJudgementCph")
public class GetWrittenJudgement_cph extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<WrittenJudgement> writtenJudgements = new VehicleInformationBindingDaoImpl().query_cph(
                jsonObject.optString("cph"));
        JSONObject jsonObject1 = new JSONObject();
        if (writtenJudgements != null){
            jsonObject1.put("total",writtenJudgements.size());
            jsonObject1.put("rows",new JSONArray(writtenJudgements));
        }
        ServletUtils.isOk(jsonObject1,writtenJudgements != null);
        resp.getWriter().write(jsonObject1.toString());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
