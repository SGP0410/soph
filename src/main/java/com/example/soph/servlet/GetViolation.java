package com.example.soph.servlet;

import com.example.soph.dao.impl.ViolationDaoImapl;
import com.example.soph.pojo.Violation;
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
 * @date 2021/3/31 21:03 星期三
 */

/**
 * 通过车牌 发动机号 车型查询违章记录
 * {"licencePlate":"鲁A10001","engineNumber":"1234","catType":"小型汽车"}
 */
@WebServlet(name = "getviolation",value = "/getviolation")
public class GetViolation extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Violation> violations = new ViolationDaoImapl().queryCph(jsonObject.optString("licencePlate"),
                jsonObject.optString("engineNumber"),jsonObject.optString("catType"));
        JSONObject jsonObject1 = new JSONObject();
        if (violations != null){
            ServletUtils.isOk(jsonObject1,true);
            JSONArray jsonArray = new JSONArray(violations);
            jsonObject1.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
