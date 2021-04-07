package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 11:06
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.FpapplyState;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "fpApplyStateById", value = "/fpApplyStateById")
public class FpApplyStateById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<FpapplyState> fpapplyStates = new FpDaoImpl().queryFpapplyStateByStateid(jsonObject.optString("stateid"));
        JSONObject jsonObject1 = new JSONObject();
        if (fpapplyStates != null){
            jsonObject1.put("total" , fpapplyStates.size());
            jsonObject1.put("rows" , new JSONArray(fpapplyStates));
        }
        ServletUtils.isOk(jsonObject1 , fpapplyStates != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
