package com.example.soph.dao;

import com.example.soph.pojo.Metro;
import com.example.soph.pojo.MetroMsg;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/31 17:14
 */
public interface MetroDao {

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

}
