package com.example.soph.dao.impl;

import com.example.soph.dao.ViolationDao;
import com.example.soph.pojo.Violation;
import com.example.soph.pojo.Violation_plate;
import com.example.soph.pojo.Violation_type;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/31 20:57 星期三
 */

public class ViolationDaoImapl extends BaseDao implements ViolationDao {


    @Override
    public List<Violation_plate> queryPlate() {
        String sql = "select * from violation_plate";
        return queryForList(Violation_plate.class,sql);
    }

    @Override
    public List<Violation_type> queryType() {
        String sql = "select * from violation_type";
        return queryForList(Violation_type.class,sql);
    }

    @Override
    public List<Violation> queryCph(String licencePlate, String engineNumber, String catType) {
        String sql = "select * from violation where licencePlate = ? and engineNumber = ? and catType = ?";
        return queryForList(Violation.class,sql,licencePlate,engineNumber,catType);
    }
}
