package com.example.soph.dao;

import com.example.soph.pojo.Service;
import com.example.soph.pojo.ServiceType;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/30 14:50
 */
public interface ServiceDao {

    /**
     * 获取推荐服务
     * @param isRecommend
     * @return
     */
    public List<Service> queryServiceByIsRecommend(String isRecommend);

    /**
     * 获取所有服务类型
     * @return
     */
    public List<ServiceType> queryServiceTypeAll();

    /**
     * 获取全部服务
     * @return
     */
    public List<Service> queryServiceAll();

}
