package com.example.soph.dao.impl;

import com.example.soph.dao.ParkingDao;
import com.example.soph.pojo.Parking;
import com.example.soph.pojo.Parkingrecord;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/31 20:42
 */
public class ParkingDaoImpl extends BaseDao implements ParkingDao {
    @Override
    public List<Parking> queryParkingAll() {
        String sql = "select * from parking";
        return queryForList(Parking.class , sql);
    }

    @Override
    public Parking queryParkingByParkingid(String parkingid) {
        String sql = "select * from parking where parkingid = ?";
        return queryForOne(Parking.class , sql , parkingid);
    }

    @Override
    public List<Parkingrecord> queryParkingrecordAll() {
        String sql = "select * from parkingrecord";
        return queryForList(Parkingrecord.class , sql);
    }

    @Override
    public List<Parkingrecord> queryParkingrecordByEntryTime(String entryTime) {
        String sql = "select * from parkingrecord where entryTime > ?";
        return queryForList(Parkingrecord.class , sql , entryTime);
    }

    @Override
    public List<Parkingrecord> queryParkingrecordByOutTime(String outTime) {
        String sql = "select * from parkingrecord where outTime > ?";
        return queryForList(Parkingrecord.class , sql , outTime);
    }
}
