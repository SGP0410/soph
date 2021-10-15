package com.example.soph.servlet.s9;

import com.example.soph.dao.impl.VehicleInformationBindingDaoImpl;
import com.example.soph.pojo.Coupon;
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
 * @date 2021/10/11 星期一
 * @Description com.example.soph.servlet.s9
 */
@WebServlet(name = "GetCoupon", value = "/GetCoupon")
public class GetCoupon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        List<Coupon> coupons = new VehicleInformationBindingDaoImpl().queryCouponAll();
        JSONObject jsonObject = new JSONObject();
        if (coupons != null){
            for (Coupon coupon : coupons) {
                coupon.setImage(ServletUtils.getImageUrl(req,coupon.getImage()));
            }
            jsonObject.put("total",coupons.size());
            jsonObject.put("rows",new JSONArray(coupons));
        }
        ServletUtils.isOk(jsonObject,coupons != null);
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
