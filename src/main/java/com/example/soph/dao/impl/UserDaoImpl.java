package com.example.soph.dao.impl;

import com.example.soph.dao.UserDao;
import com.example.soph.pojo.User;
import com.example.soph.pojo.UserDuty;
import com.example.soph.pojo.UserOpinion;
import com.example.soph.pojo.UserOrder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/29 19:33
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsernamePassword(String username, String password) {
        String sql = "select * from user where username = ? and password = ?";
        return queryForOne(User.class , sql , username , password);
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user(username,nickName,phonenumber,sex,password) values(?,?,?,?,?)";
        return update(sql , user.getUsername(),
                user.getNickName() ,
                user.getPhonenumber() ,
                user.getSex() ,
                user.getPassword());
    }

    @Override
    public User queryUserByUserId(String userId) {
        String sql = "select * from user where userId = ?";
        return queryForOne(User.class , sql , userId);
    }

    @Override
    public List<UserDuty> queryUserDutyByUserId(String userid) {
        String sql = "select * from user_duty where userid = ?";
        return queryForList(UserDuty.class , sql , userid);
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set idCard = ? , username = ? , nickName = ? , email = ? ," +
                "phonenumber = ? , sex = ? , avatar = ? , remark = ? where userId = ?";
        return update(sql , user.getIdCard() ,
                user.getUsername() ,
                user.getNickName() ,
                user.getEmail() ,
                user.getPhonenumber() ,
                user.getSex() ,
                user.getAvatar() ,
                user.getRemark() ,
                user.getUserId());
    }

    @Override
    public int updatePassword(User user) {
        System.out.println(user.toString());
        String sql = "update user set password = ? where userId = ? and username = ?";
        return update(sql , user.getPassword() ,
                user.getUserId() ,
                user.getUsername());
    }

    @Override
    public List<UserOrder> queryUserOrder() {
        String sql = "select * from user_order";
        return queryForList(UserOrder.class , sql);
    }

    @Override
    public UserOrder queryUserOrderById(String id) {
        String sql = "select * from user_order where id = ?";
        return queryForOne(UserOrder.class , sql , id);
    }

    @Override
    public List<UserOpinion> queryUserOpinionByUserId(String userId) {
        String sql = "select * from user_opinion where userId = ?";
        return queryForList(UserOpinion.class , sql , userId);
    }

    @Override
    public UserOpinion queryUserOpinionById(String id) {
        String sql = "select * from user_opinion where id = ?";
        return queryForOne(UserOpinion.class ,sql , id);
    }

    @Override
    public int addUserOpinion(UserOpinion userOpinion) {
        String sql = "insert into user_opinion(userId,content,createTime) values(?,?,?)";
        return update(sql , userOpinion.getUserId() , userOpinion.getContent(),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
