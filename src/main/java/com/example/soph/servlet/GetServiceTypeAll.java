package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 16:19
 */

import com.example.soph.dao.impl.ServiceDaoImpl;
import com.example.soph.pojo.ServiceType;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getServiceTypeAll", value = "/getServiceTypeAll")
public class GetServiceTypeAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<ServiceType> serviceTypes = new ServiceDaoImpl().queryServiceTypeAll();
        JSONObject jsonObject1 = new JSONObject();
        if (serviceTypes != null){
            jsonObject1.put("total" , serviceTypes.size());
            jsonObject1.put("rows" , new JSONArray(serviceTypes));
        }
        ServletUtils.isOk(jsonObject1 , serviceTypes != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
