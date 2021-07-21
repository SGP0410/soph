package com.example.soph.dao.impl;

import com.example.soph.dao.UserWalletDao;
import com.example.soph.pojo.UserIntegral;
import com.example.soph.pojo.UserRechargeRecord;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/19 11:34 星期一
 */

public class UserWalletDaoImpl extends BaseDao implements UserWalletDao {

    @Override
    public List<UserRechargeRecord> query_money(String userid) {
        String sql = "select * from user_recharge_record where userid = ?";
        return queryForList(UserRechargeRecord.class,sql,userid);
    }

    @Override
    public List<UserIntegral> query_integral(String userid) {
        String sql = "select * from user_integral where userid = ?";
        return queryForList(UserIntegral.class,sql,userid);
    }

    /**
     *        String sql = "insert into bus_order(userName,userTel,userId,status,start ,end,createTime) values(?,?,?,?,?,?,?)";
     *         return update(sql,name,tel,userid,status,start,end,time);
     * @param integral  金额
     * @param way       支出
     * @param userid    用户
     * @param time      时间
     * @param recording 类型
     * @return
     */
    @Override
    public int setIntegral(UserIntegral userIntegral) {
        String sql = "insert into user_integral(integral,way,userid,time,recording) values(?,?,?,?,?)";
        return update(sql,
                userIntegral.getIntegral(),
                userIntegral.getWay(),
                userIntegral.getUserid(),
                userIntegral.getTime(),
                userIntegral.getRecording()
                );
    }

    /**
     *
     * @param recharge_amount   金额
     * @param time              时间
     * @param recharge_method   方式
     * @param userid            用户
     * @param way               支出
     * @return
     */
    @Override
    public int setMoney(UserRechargeRecord userRechargeRecord) {
        String sql = "insert into user_recharge_record(recharge_amount,time,recharge_method,userid,way) values(?,?,?,?,?)";
        return update(sql,
                userRechargeRecord.getRecharge_amount(),
                userRechargeRecord.getTime(),
                userRechargeRecord.getRecharge_method(),
                userRechargeRecord.getUserid(),
                userRechargeRecord.getWay()
                );
    }

}
