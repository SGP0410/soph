package com.example.soph.dao.impl;

import com.example.soph.dao.VehicleInformationBindingDao;
import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/24 10:58 星期六
 */

public class VehicleInformationBindingDaoImpl extends BaseDao implements VehicleInformationBindingDao {

    /**
     * @param userid 用户id
     * @return
     */
    @Override
    public List<VehicleInformationBinding> query_id(String userid) {
        String sql = "select * from vehicle_information_binding where userId = ?";
        return queryForList(VehicleInformationBinding.class,sql,userid);
    }

    /**
     * 添加绑定信息
     * @param vehicleInformationBinding
     * @return
     */
    @Override
    public int setVehicleInformationBinding(VehicleInformationBinding vehicleInformationBinding) {
        String sql = "insert into vehicle_information_binding(userId,type,number,effectiveDate,idCard) values(?,?,?,?,?)";
        return update(sql,
                vehicleInformationBinding.getUserId(),
                vehicleInformationBinding.getType(),
                vehicleInformationBinding.getNumber(),
                vehicleInformationBinding.getEffectiveDate(),
                vehicleInformationBinding.getIdCard());
    }

    @Override
    public List<WrittenJudgement> query_cph(String cph) {
        String sql = "select * from written_judgement where cph = ?";
        return queryForList(WrittenJudgement.class,sql,cph);
    }

    @Override
    public List<WrittenJudgement> query_written() {
        String sql = "select * from written_judgement";
        return queryForList(WrittenJudgement.class,sql);
    }

    @Override
    public List<Apply_revocation> query_apply(String endorsementId) {
        String sql = "select * from apply_revocation where endorsementId = ?";
        return queryForList(Apply_revocation.class,sql,endorsementId);
    }

    @Override
    public int setApplyRevocation(Apply_revocation apply_revocation) {
        String sql = "insert into apply_revocation(endorsementId,cause,time,type) values(?,?,?,?)";
        return update(sql,
                apply_revocation.getEndorsementId(),
                apply_revocation.getCause(),
                apply_revocation.getTime(),
                apply_revocation.getType());
    }

    @Override
    public List<Consult> query_consult() {
        String sql = "select * from consult";
        return queryForList(Consult.class,sql);
    }

    @Override
    public List<Service_center> query_Service_center() {
        String sql = "select * from service_center";
        return queryForList(Service_center.class,sql);
    }

    @Override
    public List<Branch> query_branch() {
        String sql = "select * from branch";
        return queryForList(Branch.class,sql);
    }


}
