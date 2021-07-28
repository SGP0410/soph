package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Consult;
import com.example.soph.pojo.GasInformation;
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
 * @date 2021/7/24 17:01 星期六
 */

@WebServlet(name = "GetConsult",value = "/GetConsult")
public class GetConsult extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Consult> consultList = new VehicleInformationBindingDaoImpl().query_consult();
        JSONObject jsonObject = new JSONObject();
        if (consultList != null){
            jsonObject.put("total",consultList.size());
            JSONArray jsonArray = new JSONArray();
            for (Consult gasInformation : consultList) {
                JSONObject jsonObject1 = new JSONObject(gasInformation);
                jsonObject1.put("image",ServletUtils.getImageUrl(req,gasInformation.getImage()));
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }
        ServletUtils.isOk(jsonObject,consultList != null);
        resp.getWriter().write(jsonObject.toString());

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
