package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 11:00
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.Fpapply;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "fpApplyListByUserid", value = "/fpApplyListByUserid")
public class FpApplyListByUserid extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<Fpapply> fpapplies =
                new FpDaoImpl().queryFpapplyByUserId(jsonObject.optString("userid"));
        JSONObject jsonObject1 = new JSONObject();
        if (fpapplies != null){
            jsonObject1.put("total" , fpapplies.size());
            jsonObject1.put("rows" , new JSONArray(fpapplies));
        }
        ServletUtils.isOk(jsonObject1 , fpapplies != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
