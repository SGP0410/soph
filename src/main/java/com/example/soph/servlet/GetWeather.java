package com.example.soph.servlet;

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
 * @date 2021/9/18 11:50 星期六
 * @Description com.example.soph.servlet
 */
@WebServlet(name = "GetWeather",value = "/GetWeather")
public class GetWeather extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        String[] weatherSituations = {"晴", "阴", "多云", "小雨"};
        String[] airQualitys = {"优", "良", "轻度污染"};
        List<Weather> weatherList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            int currentTemperature = random.nextInt(40);
            int maximumTemperature = currentTemperature + random.nextInt(10);
            int minimumTemperature = currentTemperature - random.nextInt(10);
            String weatherSituation = weatherSituations[random.nextInt(weatherSituations.length)];
            String airQuality = airQualitys[random.nextInt(airQualitys.length)];
            int airHumidity = random.nextInt(60);
            int sensibleTemperature = currentTemperature - random.nextInt(5);
            int ultravioletIndex = random.nextInt(15);
            weatherList.add(new Weather(currentTemperature, maximumTemperature, minimumTemperature,
                    weatherSituation, airQuality, airHumidity, sensibleTemperature, ultravioletIndex));
        }

        JSONObject jsonObject = new JSONObject(weatherList.get(0));

        JSONArray jsonArray = new JSONArray(new Gson().toJson(weatherList));

        jsonObject.put("rows" , jsonArray);

        resp.getWriter().write(jsonObject.toString());

    }
}
