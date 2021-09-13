package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.GasInformationDaoImpl;
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
 * @date 2021/7/19 16:22 星期一
 */

/**
 * 加油记录
 */
@WebServlet(name = "GetGasRecording",value = "/GetGasRecording")
public class GetGasRecording extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<GasInformation> gasInformations = new GasInformationDaoImpl().queryGasInformation();
        JSONObject jsonObject = new JSONObject();
        if (gasInformations != null){
            jsonObject.put("total",gasInformations.size());
            jsonObject.put("rows",new JSONArray(gasInformations));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
