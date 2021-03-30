package com.example.soph.dao;

import com.example.soph.pojo.User;
import com.example.soph.pojo.UserDuty;
import com.example.soph.pojo.UserOpinion;
import com.example.soph.pojo.UserOrder;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/29 9:18
 */
public interface UserDao {

    /**
     * 根据用户名密码查询用户信息
     * @param username
     * @param password
     * @return
     */
    public User queryUserByUsernamePassword(String username , String password);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 根据用户ID查询用户信息
     * @param userId
     * @return
     */
    public User queryUserByUserId(String userId);

    /**
     * 通过UserId查询UserDuty
     * @param userid
     * @return
     */
    public List<UserDuty> queryUserDutyByUserId(String userid);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 根据用户id用户昵名改密码
     * @param user
     * @return
     */
    public int updatePassword(User user);

    /**
     * 获取订单详情列表
     * @return
     */
    public List<UserOrder> queryUserOrder();

    /**
     * 根据id获取订单详情
     * @param id
     * @return
     */
    public UserOrder queryUserOrderById(String id);

    /**
     * 根据userid获取评论列表
     * @param userId
     * @return
     */
    public List<UserOpinion> queryUserOpinionByUserId(String userId);

    /**
     * 根据评论id获取评论详情
     * @param id
     * @return
     */
    public UserOpinion queryUserOpinionById(String id);

    /**
     * 添加评论
     * @param userOpinion
     * @return
     */
    public int addUserOpinion(UserOpinion userOpinion);

}
