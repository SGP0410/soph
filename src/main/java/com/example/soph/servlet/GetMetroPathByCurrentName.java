package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/31 18:29
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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "getMetroPathByCurrentName", value = "/getMetroPathByCurrentName")
public class GetMetroPathByCurrentName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        MetroDaoImpl metroDao = new MetroDaoImpl();
        List<MetroMsg> metroMsgList = metroDao.queryMetroMsgByName(jsonObject.optString("currentName"));
        List<Metro> metroList = new ArrayList<>();
        for (MetroMsg m:metroMsgList) {
            metroList.add(metroDao.queryMetroByLineId(m.getLineId()));
        }
        JSONObject jsonObject1 = new JSONObject();
        if (metroList.size() > 0){
            jsonObject1.put("total" , metroList.size());
            for (Metro m:metroList) {
                m.setImg(ServletUtils.getImageUrl(request , m.getImg()));
            }
            jsonObject1.put("rows" , new JSONArray(metroList));
        }
        ServletUtils.isOk(jsonObject1 , metroList.size() > 0);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
