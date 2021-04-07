package com.example.soph.dao.impl;

import com.example.soph.dao.HospitalImgDao;
import com.example.soph.pojo.Hospital_msg;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/31 17:24 星期三
 */

public class HospitalImgDaoImapI extends BaseDao implements HospitalImgDao {

    @Override
    public List<Hospital_msg> queryHospitalId(String hospitalId) {
        String sql = "select * from hospital_msg where hospitalId = ?";
        return queryForList(Hospital_msg.class,sql,hospitalId);
    }
}
