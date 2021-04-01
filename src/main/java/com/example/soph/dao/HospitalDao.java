package com.example.soph.dao;

import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/30 21:01 星期二
 */

public interface HospitalDao {

    public List<Hospital_save> querySaveUserid(String userid);

    public int setquerylsitsave(String carid,String patientName,String tel,String doc,String startime,String moeny,String userId);

    public List<Hospital_doctors> queryHosp_doctors(String hospitalId);

    public List<Hospital_type> query(String hospitalId);

    public int setquerylist(String name, String sex, String caid, String birthday, String tel, String adders);

    public List<Hospital> queryHospitalList();

    public Hospital queryHospitalId(String hospitalId);

    public List<Hospital_idcard> queryHospital_idcard(String idcard);

}
