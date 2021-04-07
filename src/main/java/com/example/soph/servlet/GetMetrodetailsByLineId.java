package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/31 18:58
 */

import com.example.soph.dao.impl.MetroDaoImpl;
import com.example.soph.pojo.Metro;
import com.example.soph.pojo.MetroMsg;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getMetrodetailsByLineId", value = "/getMetrodetailsByLineId")
public class GetMetrodetailsByLineId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        MetroDaoImpl metroDao = new MetroDaoImpl();
        Metro metro = metroDao.queryMetroByLineId(jsonObject.optString("lineId"));
        List<MetroMsg> metroMsgs = metroDao.queryMetroMsgByLineId(jsonObject.optString("lineId"));
        JSONObject jsonObject1 = null;
        if (metro != null && metroMsgs != null){
            metro.setImg(ServletUtils.getImageUrl(request , metro.getImg()));
            jsonObject1 = new JSONObject(metro);
            jsonObject1.put("metroStepsList" , new JSONArray(metroMsgs));
        }
        ServletUtils.isOk(jsonObject1 , metro != null && metroMsgs != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
