package com.example.soph.dao.impl;

import com.example.soph.dao.SlidepictureDao;
import com.example.soph.pojo.Slidepicture;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/30 10:02
 */
public class SlidepictureDaoImpl extends BaseDao implements SlidepictureDao {
    @Override
    public List<Slidepicture> querySlidepictureByType(String type) {
        String sql = "select * from slidepicture where type = ?";
        return queryForList(Slidepicture.class , sql , type);
    }
}
