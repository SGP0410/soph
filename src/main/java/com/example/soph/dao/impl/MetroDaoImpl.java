package com.example.soph.dao.impl;

import com.example.soph.dao.MetroDao;
import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/31 17:14
 */
public class MetroDaoImpl extends BaseDao implements MetroDao {


    @Override
    public List<Metrofound> query_found() {
        String sql = "select * from metrofound";
        return queryForList(Metrofound.class,sql);
    }

    @Override
    public List<Metro_theme> query_them() {
        String sql = "select * from metro_theme";
        return queryForList(Metro_theme.class,sql);
    }

    @Override
    public List<Metro_notice> queryNumber(String number) {
        String sql = "select * from metro_notice where number = ?";
        return queryForList(Metro_notice.class,sql,number);
    }

    @Override
    public List<Metro> query() {
        String sql = "select * from metro";
        return queryForList(Metro.class,sql);
    }

    @Override
    public List<MetroMsg> queryMetroMsgByName(String name) {
        String sql = "select * from metro_msg where name = ?";
        return queryForList(MetroMsg.class , sql , name);
    }

    @Override
    public Metro queryMetroByLineId(String lineId) {
        String sql = "select * from metro where lineId = ?";
        return queryForOne(Metro.class , sql , lineId);
    }

    @Override
    public List<MetroMsg> queryMetroMsgByLineId(String lineId) {
        String sql = "select * from metro_msg where lineId = ?";
        return queryForList(MetroMsg.class , sql , lineId);
    }
}
