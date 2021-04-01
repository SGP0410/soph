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

}
