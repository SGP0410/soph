package com.example.soph.dao;

import com.example.soph.pojo.Bus;
import com.example.soph.pojo.Bus_msg;
import com.example.soph.pojo.Bus_order;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/31 20:19 星期三
 */

public interface BusDao {

    public int setbus_order(String name,String tel,String userid,String status,String start,String end , String time);

    public int setbus_order_msg(String orderNum,String username,String linesId,String createTime,String start,String end,String price,String userTel,String userId,String status);

    public List<Bus_order> queryOrder(String userId);

    public List<Bus> queryList();

    public List<Bus_msg> queryLinesId(String linesId);

    public Bus queryBusId(String id);

}
