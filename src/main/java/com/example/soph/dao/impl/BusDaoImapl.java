package com.example.soph.dao.impl;

import com.example.soph.dao.BusDao;
import com.example.soph.pojo.Bus;
import com.example.soph.pojo.Bus_msg;
import com.example.soph.pojo.Bus_order;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/31 20:19 星期三
 */

public class BusDaoImapl extends BaseDao implements BusDao {


    @Override
    public int setbus_order(String name, String tel, String userid, String status, String start, String end , String time) {
        String sql = "insert into bus_order(userName,userTel,userId,status,start,end,createTime) values(?,?,?,?,?,?,?)";
        return update(sql,name,tel,userid,status,start,end,time);
    }

    @Override
    public int setbus_order_msg(String orderNum, String username, String linesId, String createTime, String start, String end, String price, String userTel, String userId, String status) {
        String sql = "insert into bus_order(orderNum,username,linesId,createTime,start,end,price,userTel,userId,status) values(?,?,?,?,?,?,?,?,?,?)";
        return update(sql,orderNum,username,linesId,createTime,start,end,price,userTel,userId,status);
    }

    @Override
    public List<Bus_order> queryOrder(String userId) {
        String sql = "select * from bus_order where userId = ?";
        return queryForList(Bus_order.class,sql,userId);
    }

    @Override
    public List<Bus> queryList() {
        String sql = "select * from bus";
        return queryForList(Bus.class,sql);
    }

    @Override
    public List<Bus_msg> queryLinesId(String linesId) {
        String sql = "select * from bus_msg where linesId = ?";
        return queryForList(Bus_msg.class,sql,linesId);
    }

    @Override
    public Bus queryBusId(String id) {
        String sql = "select * from bus where linesId = ?";
        return queryForOne(Bus.class,sql,id);
    }

}
