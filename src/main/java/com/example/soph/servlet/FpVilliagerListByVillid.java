package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 11:28
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.FpVilliager;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

//@WebServlet(name = "fpVilliagerListByVillid", value = "/fpVilliagerListByVillid")
public class FpVilliagerListByVillid extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<FpVilliager> fpVilliagers =
                new FpDaoImpl().queryFpVilliagerByVillid(jsonObject.optString("villid"));
        JSONObject jsonObject1 = new JSONObject();
        if (fpVilliagers != null){
            jsonObject1.put("total" , fpVilliagers.size());
            jsonObject1.put("rows" , new JSONArray(fpVilliagers));
        }
        ServletUtils.isOk(jsonObject1 , fpVilliagers != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
