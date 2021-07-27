package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Branch;
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
 * @date 2021/7/24 17:56 星期六
 */

@WebServlet(name = "GetBranch",value = "/GetBranch")
public class GetBranch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<Branch> branches = new VehicleInformationBindingDaoImpl().query_branch();
        JSONObject jsonObject = new JSONObject();
        if (branches != null){
            jsonObject.put("total",branches.size());
            jsonObject.put("rows",new JSONArray(branches));
        }
        ServletUtils.isOk(jsonObject,branches != null);
        resp.getWriter().write(jsonObject.toString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
