package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/30 10:01
 */

import com.example.soph.dao.impl.SlidepictureDaoImpl;
import com.example.soph.pojo.Slidepicture;
import com.example.soph.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getSlidepicture", value = "/getSlidepicture")
public class GetSlidepicture extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        List<Slidepicture> slidepictures = new SlidepictureDaoImpl()
                .querySlidepictureByType(jsonObject.optString("type"));
        JSONObject jsonObject1 = new JSONObject();
        if (slidepictures != null){
            jsonObject1.put("total" , slidepictures.size());
            JSONArray jsonArray = new JSONArray();
            for (Slidepicture s : slidepictures) {
                JSONObject jsonObject2 = new JSONObject(s);
                jsonObject2.put("imgUrl" , ServletUtils.getImageUrl(request , s.imgUrl));
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows" , jsonArray);
        }
        ServletUtils.isOk(jsonObject1 , slidepictures != null);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
