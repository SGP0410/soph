package com.example.soph.dao.impl;

import com.example.soph.dao.HospitalDao;
import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/30 21:01 星期二
 */

public class HospitalDaoImpl extends BaseDao implements HospitalDao {

    @Override
    public List<Hospital_save> querySaveUserid(String userid) {
        String sql = "select * from hospital_save where userId = ?";
        return queryForList(Hospital_save.class,sql,userid);
    }

    @Override
    public int setquerylsitsave(String carid, String patientName, String tel, String doc, String startime, String moeny,String userId) {
        String sql = "INSERT INTO hospital_save(carid,patientName,tel,doc,startime,moeny,userId) VALUES (?,?,?,?,?,?,?)";
        return update(sql,carid,patientName,tel,doc,startime,moeny,userId);
    }

    @Override
    public List<Hospital_doctors> queryHosp_doctors(String hospitalId) {
        String sql = "select * from doctors where hospitalId = ?";
        return queryForList(Hospital_doctors.class,sql,hospitalId);
    }

    @Override
    public List<Hospital_type> query(String hospitalId) {
        String sql = "select * from hospital_type where hospitalId = ?";
        return queryForList(Hospital_type.class,sql,hospitalId);
    }

    @Override
    public int setquerylist(String name, String sex, String caid, String birthday, String tel, String adders) {
        String sql = "INSERT INTO hospital_idcard(name,sex,cardId,birthday,tel,adders) VALUES (?,?,?,?,?,?)";
        return update(sql,name,sex,caid,birthday,tel,adders);
    }

    @Override
    public List<Hospital> queryHospitalList() {
        String sql = "select * from hospital";
        return queryForList(Hospital.class,sql);
    }

    @Override
    public Hospital queryHospitalId(String hospitalId) {
        String sql = "select * from hospital where hospitalId = ?";
        return queryForOne(Hospital.class,sql,hospitalId);
    }

    @Override
    public List<Hospital_idcard> queryHospital_idcard(String idcard) {
        String sql = "select * from hospital_idcard where cardId = ?";
        return queryForList(Hospital_idcard.class,sql,idcard);
    }


}
