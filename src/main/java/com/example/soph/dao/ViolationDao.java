package com.example.soph.dao;

import com.example.soph.pojo.Violation;
import com.example.soph.pojo.Violation_plate;
import com.example.soph.pojo.Violation_type;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/31 20:57 星期三
 */

public interface ViolationDao {

    public List<Violation_plate> queryPlate();

    public List<Violation_type> queryType();

    public List<Violation> queryCph(String licencePlate,String engineNumber,String catType);

}
