package com.example.soph.dao;

import com.example.soph.pojo.UserIntegral;
import com.example.soph.pojo.UserRechargeRecord;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/19 11:33 星期一
 */

public interface UserWalletDao {

    /**
     * 获取所有金额
     * @return
     */
    public List<UserRechargeRecord> query_money(String userid);

    /**
     * 获取所有积分
     * @return
     */
    public List<UserIntegral> query_integral(String userid);

    /**
     *
     * @param integral  金额
     * @param way       支出
     * @param userid    用户
     * @param time      时间
     * @param recording 类型
     * @return
     */
    public int setIntegral(UserIntegral userIntegral);

    /**
     *
     * @param recharge_amount   金额
     * @param time              时间
     * @param recharge_method   方式
     * @param userid            用户
     * @param way               支出
     * @return
     */
    public int setMoney(UserRechargeRecord userRechargeRecord);

}
