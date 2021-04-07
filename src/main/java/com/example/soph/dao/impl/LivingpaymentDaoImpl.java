package com.example.soph.dao.impl;

import com.example.soph.dao.LivingpaymentDao;
import com.example.soph.pojo.LivingPaymentType;
import com.example.soph.pojo.Livingpayment;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/4/1 8:14
 */
public class LivingpaymentDaoImpl extends BaseDao implements LivingpaymentDao {

    @Override
    public List<Livingpayment> queryLivingpaymentByUserIdLiveName(String userId, String liveName) {
        String sql = "select * from livingpayment where userId = ? and liveName = ?";
        return queryForList(Livingpayment.class , sql , userId , liveName);
    }

    @Override
    public List<Livingpayment> queryLivingpaymentByUserId(String userId) {
        String sql = "select * from livingpayment where userId = ?";
        return queryForList(Livingpayment.class , sql , userId);
    }

    @Override
    public int addLivingPaymentType(String typeName, String userid) {
        String sql = "insert into livingpayment_type(userid , typeName) values(?,?)";
        return update(sql , userid , typeName);
    }

    @Override
    public List<LivingPaymentType> queryLivingPaymentTypeByUserId(String userId) {
        String sql = "select * from livingpayment_type where userid = ?";
        return queryForList(LivingPaymentType.class , sql , userId);
    }
}
