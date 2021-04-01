package com.example.soph.servlet;

import com.example.soph.dao.impl.HospitalDaoImpl;
import com.example.soph.dao.impl.HospitalImgDaoImapI;
import com.example.soph.pojo.Hospital_idcard;
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
 * @date 2021/3/31 19:05 星期三
 */

/**
 * 通过身份证号获取就诊卡
 * {"cardId":"222231231"}
 */
@WebServlet(name = "gethospital_idcard" ,value = "/gethospital_idcard")
public class GetHospital_idcard extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Hospital_idcard> idcards = new HospitalDaoImpl().queryHospital_idcard(jsonObject.optString("cardId"));
        JSONObject jsonObject1 = new JSONObject();
        if (idcards != null){
            ServletUtils.isOk(jsonObject1,true);
            JSONArray jsonArray = new JSONArray(idcards);
            jsonObject1.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }
}
