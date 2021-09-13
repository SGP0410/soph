package com.example.soph.dao;

import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/31 17:14
 */
public interface MetroDao {


    /**
     *失物招领
     * @return
     */
    public List<Metrofound> query_found();

    /**
     * 查询主题
     * @return
     */
    public List<Metro_theme> query_them();

    /**
     * number 1 = 乘车须知 2 = 运营公告
     * @param number
     * @return
     */
    public List<Metro_notice> queryNumber(String number);

    /**
     * 查询所有数据
     * @return
     */
    public List<Metro> query();

    /**
     * 根据站点名查询站点信息
     * @param name
     * @return
     */
    public List<MetroMsg> queryMetroMsgByName(String name);

    /**
     * 根据路线id查询路线信息
     * @param lineId
     * @return
     */
    public Metro queryMetroByLineId(String lineId);

    /**
     * 通过路线id查询站点
     * @param lineId
     * @return
     */
    public List<MetroMsg> queryMetroMsgByLineId(String lineId);

    /**
     * 获取中英文地图
     * @return
     */
    public List<Metro_language> queryMetro_language();


    /**
     * 图例
     * @return
     */
    public List<Metro_legend> queryMetroLegend();

}
