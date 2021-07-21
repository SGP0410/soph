package com.example.soph.dao.impl;

import com.example.soph.dao.GasInformationDao;
import com.example.soph.pojo.GasInformation;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/19 15:29 星期一
 */

public class GasInformationDaoImpl extends BaseDao implements GasInformationDao {


    @Override
    public List<GasInformation> queryGasInformation() {
        String sql = "select * from gas_information";
        return queryForList(GasInformation.class,sql);
    }

}
