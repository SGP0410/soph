package com.example.soph.servlet;

import com.example.soph.pojo.Temperature;
import com.example.soph.pojo.Weather;
import com.example.soph.utils.ServletUtils;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 关鑫
 * @date 2021/9/18 19:31 星期六
 * @Description com.example.soph.servlet
 */

@WebServlet(name = "GetTemperature",value = "/GetTemperature")
public class GetWeatherShi extends HttpServlet {

    /**
     * pm2.5
     * wd
     * sd
     * guangzhao
     * co2
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        List<Temperature> weatherList = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int pm = (int) Math.floor((Math.random()*150)+1);
            int wendu = (int) Math.floor((Math.random()*45)+1);
            int shidu = (int) Math.floor((Math.random()*100)+1);
            int guangzhao = (int) Math.floor((Math.random()*6000)+1);
            int co2 = (int) Math.floor((Math.random()*10000)+1);
            weatherList.add(new Temperature(pm,wendu,shidu,guangzhao,co2));
        }

        int pm = (int) Math.floor((Math.random()*150)+1);
        int wendu = (int) Math.floor((Math.random()*45)+1);
        int shidu = (int) Math.floor((Math.random()*100)+1);
        int guangzhao = (int) Math.floor((Math.random()*6000)+1);
        int co2 = (int) Math.floor((Math.random()*80)+1);

        Temperature temperature = new Temperature(pm,wendu,shidu,guangzhao,co2);

        JSONObject jsonObject = new JSONObject(temperature);

        JSONArray jsonArray = new JSONArray(new Gson().toJson(weatherList));

        jsonObject.put("rows" , jsonArray);

        resp.getWriter().write(jsonObject.toString());



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
