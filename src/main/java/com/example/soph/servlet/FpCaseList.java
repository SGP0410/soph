package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/4/1 10:07
 */

import com.example.soph.dao.impl.FpDaoImpl;
import com.example.soph.pojo.Fpcase;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "fpCaseList", value = "/fpCaseList")
public class FpCaseList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<Fpcase> fpcases = new FpDaoImpl().queryFpcaseAll();
        JSONObject jsonObject = new JSONObject();
        if (fpcases != null){
            jsonObject.put("total" , fpcases.size());
            for (Fpcase f:fpcases) {
                f.setCasepicture(ServletUtils.getImageUrl(request , f.getCasepicture()));
            }
            jsonObject.put("rows" , new JSONArray(fpcases));
        }
        ServletUtils.isOk(jsonObject , fpcases != null);
        response.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
