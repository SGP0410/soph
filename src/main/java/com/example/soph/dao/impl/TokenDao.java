package com.example.soph.dao.impl;

import com.example.soph.pojo.MyToken;
import com.example.soph.pojo.User;

import java.util.List;

public class TokenDao extends BaseDao {
    public int addToken(String  myToken) {
        String sql = "insert into mytoken(token) values(?)";
        return update(sql, myToken);
    }

    public int deleteToken (){
        String sql = "DELETE FROM myToken LIMIT 1";
        return update(sql);
    }

    public List<MyToken> selectToken() {
        String sql = "select * from myToken";
        return queryForList(MyToken.class,sql);
    }

    public MyToken findToken(String token) {
        String sql = "select * from myToken where token=?";
        return queryForOne(MyToken.class , sql , token);
    }
}
