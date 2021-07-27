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
 * @date 2021/7/24 15:51 星期六
 */

@WebServlet(name = "GetWrittenJudgement",value = "/GetWrittenJudgement")
public class GetWrittenJudgement extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<WrittenJudgement> writtenJudgements = new VehicleInformationBindingDaoImpl().query_written();
        JSONObject jsonObject = new JSONObject();
        if (writtenJudgements != null){
            jsonObject.put("total",writtenJudgements.size());
            jsonObject.put("rows",new JSONArray(writtenJudgements));
        }
        ServletUtils.isOk(jsonObject,writtenJudgements != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
