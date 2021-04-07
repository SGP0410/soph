package com.example.soph.dao;

import com.example.soph.pojo.LivingPaymentType;
import com.example.soph.pojo.Livingpayment;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/4/1 8:14
 */
public interface LivingpaymentDao {

    /**
     * 根据用户id缴费名称查询缴费记录
     * @param userId
     * @return
     */
    public List<Livingpayment> queryLivingpaymentByUserIdLiveName(String userId , String liveName);


    /**
     * 根据用户id查询缴费记录
     * @param userId
     * @return
     */
    public List<Livingpayment> queryLivingpaymentByUserId(String userId);

    /**
     * 根据用户id添加分组
     * @param typeName
     * @param userid
     * @return
     */
    public int addLivingPaymentType(String typeName , String userid);

    /**
     * 根据用户id查询分组
     * @param userId
     * @return
     */
    public List<LivingPaymentType> queryLivingPaymentTypeByUserId(String userId);

}
