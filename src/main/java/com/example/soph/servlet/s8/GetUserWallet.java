package com.example.soph.servlet.s8;

import com.example.soph.dao.impl.UserWalletDaoImpl;
import com.example.soph.pojo.UserIntegral;
import com.example.soph.pojo.UserRechargeRecord;
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
 * @date 2021/7/19 11:20 星期一
 */

/**
 * 查询余额和积分
 */
@WebServlet(name = "GetUserWallet",value = "/GetUserWallet")
public class GetUserWallet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        String userid = jsonObject.optString("userid");
        System.out.println(userid);

        List<UserRechargeRecord> userRechargeRecords = new UserWalletDaoImpl().query_money(userid);
        List<UserIntegral> userIntegrals = new UserWalletDaoImpl().query_integral(userid);
        int jie = 0;
        int jifen = 0;
        for (UserIntegral userIntegral : userIntegrals) {
            if ("1".equals(userIntegral.getWay())){
                jifen += userIntegral.getIntegral();
            }
        }
        for (UserIntegral userIntegral : userIntegrals) {
            if ("1".equals(userIntegral.getWay())){
            }else {
                jifen -= userIntegral.getIntegral();
            }
        }

        for (UserRechargeRecord userRechargeRecord : userRechargeRecords) {
            if (userRechargeRecord.getWay().equals("1")){
                jie += userRechargeRecord.getRecharge_amount();
            }
        }

        for (UserRechargeRecord userRechargeRecord : userRechargeRecords) {
            if (userRechargeRecord.getWay().equals("1")){

            }else {
                jie -= userRechargeRecord.getRecharge_amount();
            }
        }

        JSONObject jsonObject1 = new JSONObject();
        if (userRechargeRecords != null){
            jsonObject1.put("money",jie+"");
            jsonObject1.put("integral",jifen+"");
        }
        ServletUtils.isOk(jsonObject1,userRechargeRecords!=null);
        resp.getWriter().write(jsonObject1.toString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }


}
