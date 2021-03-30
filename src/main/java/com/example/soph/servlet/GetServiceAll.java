package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 16:27
 */

import com.example.soph.dao.impl.ServiceDaoImpl;
import com.example.soph.pojo.Service;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getServiceAll", value = "/getServiceAll")
public class GetServiceAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<Service> services = new ServiceDaoImpl().queryServiceAll();
        JSONObject jsonObject1 = new JSONObject();
        if (services != null){
            jsonObject1.put("total" , services.size());
            jsonObject1.put("rows" , new JSONArray(services));
        }
        ServletUtils.isOk(jsonObject1 , services != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
