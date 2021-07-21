package com.example.soph.dao;

import com.example.soph.pojo.Parking;
import com.example.soph.pojo.Parking_User;
import com.example.soph.pojo.Parkingrecord;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/31 20:41
 */
public interface ParkingDao {

    /**
     * 获取停车场列表
     * @return
     */
    public List<Parking> queryParkingAll();

    /**
     * 根据停车场id查询停车场详情
     * @param parkingid
     * @return
     */
    public Parking queryParkingByParkingid(String parkingid);

    /**
     * 获取全部停车记录
     * @return
     */
    public List<Parkingrecord> queryParkingrecordAll();

    /**
     * 根据入场时间查询停车记录
     * @param entryTime
     * @return
     */
    public List<Parkingrecord> queryParkingrecordByEntryTime(String entryTime);

    /**
     * 根据出场时间查询停车记录
     * @param entryTime
     * @return
     */
    public List<Parkingrecord> queryParkingrecordByOutTime(String entryTime);

    /**
     * 获取车主和车牌
     * @return
     */
    public List<Parking_User> queryParkingUser();

}
