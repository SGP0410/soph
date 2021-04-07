package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 10:30
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.FpVilliageDetail;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "fpVilliageInfo", value = "/fpVilliageInfo")
public class FpVilliageInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        FpVilliageDetail fpVilliageDetail = new FpDaoImpl().queryFpVilliageDetailByVillid(jsonObject.optString("villid"));
        JSONObject jsonObject1 = new JSONObject();
        if (fpVilliageDetail != null){
            jsonObject1.put("total" , 1);
            fpVilliageDetail.setEnvironment_pic(ServletUtils.getImageUrl(request , fpVilliageDetail.getEnvironment_pic()));
            jsonObject1.put("rows" , new JSONObject(fpVilliageDetail));
        }
        ServletUtils.isOk(jsonObject1 , fpVilliageDetail != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
