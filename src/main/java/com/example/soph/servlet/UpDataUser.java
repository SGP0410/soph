package com.example.soph.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/29 20:42
 */

import com.example.soph.dao.impl.UserDaoImpl;
import com.example.soph.pojo.User;
import com.example.soph.utils.ServletUtils;
import com.google.gson.Gson;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@WebServlet(name = "upDataUser", value = "/upDataUser")
public class UpDataUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        PrintWriter writer = response.getWriter();
        JSONObject jsonObject = new JSONObject();
        String fileName = "";

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 定义最大允许上传的文件尺寸
        upload.setFileSizeMax(5 * 1024 * 1024);

        // 获得文件保存路径
        String rootPath = request.getServletContext().getRealPath("/images/");
        System.out.println("rootPath ==" + rootPath);

        try {
            Map<String, List<FileItem>> map = upload.parseParameterMap(request);
            for (Map.Entry<String, List<FileItem>> entry : map.entrySet()) {
                List<FileItem> list = entry.getValue();
                for (FileItem item : list) {
                    if (item.isFormField()) {
                        //如果获取的 表单信息是普通的文本信息
                        String arr[] = processFormField(item);
                        jsonObject.put(arr[0], arr[1]);
                    } else {
                        //对传入的文件 ，比如说二进制的 图片，电影这些
                        fileName = processUploadFile(rootPath, item, writer);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(jsonObject);
        upDate(jsonObject, fileName, writer);

        writer.close();
    }

    private void upDate(JSONObject jsonObject, String fileName, PrintWriter writer) throws IOException {
        User mUser = new Gson().fromJson(jsonObject.toString(), User.class);
        JSONObject jsonObject1 = new JSONObject();
        if (fileName != null && !fileName.equals("")) {
            mUser.setAvatar(fileName);
        } else {
            mUser.setAvatar("");
        }
        int i = new UserDaoImpl().updateUser(mUser);
        System.out.println(i);
        ServletUtils.isOk(jsonObject1, i == 1);
        writer.write(jsonObject1.toString());
    }

    // 处理表单内容
    private String[] processFormField(FileItem item) throws Exception {
        String name = item.getFieldName();
        String value = item.getString();
        System.out.println("name = " + getMyString(name) + "---");
        System.out.println("value = " + getMyString(value));
        return new String[]{getMyString(name), getMyString(value)};
    }

    private String getMyString(String k) {
        try {
            return new String(k.getBytes("iso8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    // 处理上传的文件
    //返回文件名
    private String processUploadFile(String filePath, FileItem item, PrintWriter pw) throws Exception {
        // 此时的文件名包含了完整的路径，得注意加工一下
        String filename = item.getName();
        System.out.println("完整的文件名：" + filename);
        int index = filename.lastIndexOf("\\");
        filename = filename.substring(index + 1, filename.length());

        long fileSize = item.getSize();

        if ("".equals(filename) && fileSize == 0) {
            System.out.println("文件名为空 ...");
            return "";
        }

        File uploadFile = new File(filePath + File.separator + filename);
        item.write(uploadFile);
        return filename;
    }
}
