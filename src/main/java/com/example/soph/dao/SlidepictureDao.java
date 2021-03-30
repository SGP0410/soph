package com.example.soph.dao;

import com.example.soph.pojo.Slidepicture;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/30 10:02
 */
public interface SlidepictureDao {

    /**
     *  根据类型获取引导页或轮播图
     * @param type
     * @return
     */
    public List<Slidepicture> querySlidepictureByType(String type);

}
