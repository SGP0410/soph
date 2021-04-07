package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 10:27
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.FpVilliage;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "fpVillageList", value = "/fpVillageList")
public class FpVillageList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<FpVilliage> fpVilliages = new FpDaoImpl().queryFpVilliageAll();
        JSONObject jsonObject1 = new JSONObject();
        if (fpVilliages != null){
            jsonObject1.put("total" , fpVilliages.size());
            for (FpVilliage f:fpVilliages) {
                f.setVillpicture(ServletUtils.getImageUrl(request , f.getVillpicture()));
            }
            jsonObject1.put("rows" , new JSONArray(fpVilliages));
        }
        ServletUtils.isOk(jsonObject1 , fpVilliages != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
