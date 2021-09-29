package com.example.soph.servlet;

import com.example.soph.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 关鑫
 * @date 2021/9/18 20:15 星期六
 * @Description com.example.soph.servlet
 */
@WebServlet(name = "GetTemperatureInif",value = "/GetTemperatureInif")
public class GetTemperatureInif extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        BufferedReader reader = req.getReader();
        reader.close();
        PrintWriter out = resp.getWriter();
        Random random = new Random();
        int temperature = random.nextInt(10) + 15;
        String weather1 = "";
        switch (random.nextInt(3)) {
            case 0:
                weather1 = "晴";
                break;
            case 1:
                weather1 = "小雨";
                break;
            case 2:
                weather1 = "阴";
                break;
        }
        JSONObject jObject = new JSONObject();
        jObject.put("temperature", Integer.valueOf(temperature));
        jObject.put("weather", weather1);
        List<JSONObject> jsonArray = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            JSONObject jObject2 = new JSONObject();
            String weather = "";
            switch (random.nextInt(3)) {
                case 0:
                    weather = "晴";
                    break;
                case 1:
                    weather = "小雨";
                    break;
                case 2:
                    weather = "阴";
                    break;
            }
            jObject2.put("interval", String.valueOf(random.nextInt(15)) + "~" + (random.nextInt(15) + 25));
            jObject2.put("weather", weather);
            jsonArray.add(jObject2);
        }
        jObject.put("rows", jsonArray);
        out.write(jObject.toString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
