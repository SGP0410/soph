package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 10:53
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.FpSeek;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "fpSeekByUserid", value = "/fpSeekByUserid")
public class FpSeekByUserid extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<FpSeek> fpSeeks =
                new FpDaoImpl().queryFpSeekByUserId(jsonObject.optString("userid"));
        JSONObject jsonObject1 = new JSONObject();
        if (fpSeeks != null){
            jsonObject1.put("total" , fpSeeks.size());
            jsonObject1.put("rows" , new JSONArray(fpSeeks));
        }
        ServletUtils.isOk(jsonObject1 , fpSeeks != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
