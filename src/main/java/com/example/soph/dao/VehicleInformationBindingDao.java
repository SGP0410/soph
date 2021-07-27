package com.example.soph.dao;

import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/24 10:59 星期六
 */

public interface VehicleInformationBindingDao {

    /**
     * 根据userid查询用户绑定的信息
     * @param userid 用户id
     * @return
     */
    public List<VehicleInformationBinding> query_id(String userid);

    /***
     * 添加绑定信息
     * @param vehicleInformationBinding
     * @return
     */
    public int setVehicleInformationBinding(VehicleInformationBinding vehicleInformationBinding);


    public List<WrittenJudgement> query_cph(String cph);

    public List<WrittenJudgement> query_written();

    public List<Apply_revocation> query_apply(String endorsementId);

    public int setApplyRevocation(Apply_revocation apply_revocation);

    public List<Consult> query_consult();

    public List<Service_center> query_Service_center();

    public List<Branch> query_branch();

}
