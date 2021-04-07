package com.example.soph.dao;

import com.example.soph.pojo.Hospital_msg;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/31 17:24 星期三
 */

public interface HospitalImgDao {

    public List<Hospital_msg> queryHospitalId(String hospitalId);

}
