package com.example.soph.dao.impl;

import com.example.soph.dao.ServiceDao;
import com.example.soph.pojo.Service;
import com.example.soph.pojo.ServiceType;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/30 14:50
 */
public class ServiceDaoImpl extends BaseDao implements ServiceDao {

    @Override
    public List<Service> queryServiceByIsRecommend(String isRecommend) {
        String sql = "select * from service where isRecommend = ?";
        return queryForList(Service.class , sql , isRecommend);
    }

    @Override
    public List<ServiceType> queryServiceTypeAll() {
        String sql = "select * from service_type";
        return queryForList(ServiceType.class , sql);
    }

    @Override
    public List<Service> queryServiceAll() {
        String sql = "select * from service";
        return queryForList(Service.class , sql);
    }
}
