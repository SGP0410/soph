package com.example.soph.servlet;

import com.example.soph.dao.impl.HospitalImgDaoImapI;
import com.example.soph.pojo.Hospital_msg;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.json.Json;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/31 17:20 星期三
 */

/**
 * 通过医院id获取轮播图
 */
@WebServlet(name = "gethospitalimg",value = "/gethospitalimg")
public class GetHospitalImg extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Hospital_msg> msgs = new HospitalImgDaoImapI().queryHospitalId(jsonObject.optString("hospitalId"));
        JSONObject jsonObject1 = new JSONObject();
        if (msgs !=null){
            ServletUtils.isOk(jsonObject1,true);
            System.out.println(msgs.toString());
            for (Hospital_msg h:msgs) {
                h.setImgUrl(ServletUtils.getImageUrl(req , h.getImgUrl()));
            }
            JSONArray jsonArray = new JSONArray(msgs);
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
