package com.example.soph.servlet;

import com.example.soph.dao.impl.HospitalDaoImpl;
import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.Hospital_idcard;
import com.example.soph.pojo.User;
import com.example.soph.utils.ServletUtils;
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
 * @date 2021/3/31 19:18 星期三
 */

/**
 * 提交就诊卡信息
 * {"name":123,"sex":"0","caid":"283823712","birthday":"2020-01-12","tel":"1928122221","adders":"高西南"}
 */
@WebServlet(name = "sethospital_idcard",value = "/sethospital_idcard")
public class SetHospital_idcard extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        /**
         * name,sex,caid,birthday,tel,adders
         */
        int a = new HospitalDaoImpl().setquerylist(
                jsonObject.optString("name"),
                jsonObject.optString("sex"),
                jsonObject.optString("caid"),
                jsonObject.optString("birthday"),
                jsonObject.getString("tel"),
                jsonObject.optString("adders")
        );

        if (a == 1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());
    }

}
