package com.example.soph.utils;


import com.example.soph.dao.impl.TokenDao;
import com.example.soph.pojo.MyToken;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Create by 张瀛煜 On 2020年11月26日 下午4:58:38
 */
public class ExistToken {

	public boolean isVialable(String tokenString) {
		return new TokenDao().findToken(tokenString)==null?false:true;
	}

}
