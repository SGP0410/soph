package com.example.soph.servlet;

import com.example.soph.dao.impl.HospitalDaoImpl;
import com.example.soph.pojo.Hospital;
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
 * @date 2021/3/31 17:08 星期三
 */

/**
 * 通过医院编号查询医院详情
 * {"hospitalId":"1"}
 */
@WebServlet(name = "gethospitelid",value = "/gethospitelid")
public class GetHospitalId extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        Hospital hospital = new HospitalDaoImpl().queryHospitalId(jsonObject.optString("hospitalId"));
        hospital.setImgUrl(ServletUtils.getImageUrl(req , hospital.getImgUrl()));
        JSONObject jsonObject1 = new JSONObject(hospital);
        jsonObject1.remove("id");
        if (hospital != null){
            ServletUtils.isOk(jsonObject1,true);
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
