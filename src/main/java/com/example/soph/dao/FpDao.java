package com.example.soph.dao;

import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:54
 */
public interface FpDao {

    /**
     * 获取全部扶贫新闻
     * @return
     */
    public List<FpNews> queryFpNewsAll();

    /**
     * 获取所有扶贫案例信息
     * @return
     */
    public List<Fpcase> queryFpcaseAll();

    /**
     * 根据案例id使其点赞数加1
     * @param caseid
     * @return
     */
    public int updateFpcaseThumbup(String caseid);

    /**
     * 返回所有村庄信息
     * @return
     */
    public List<FpVilliage> queryFpVilliageAll();

    /**
     * 根据村庄id查询村庄详情
     * @param villid
     * @return
     */
    public FpVilliageDetail queryFpVilliageDetailByVillid(String villid);

    /**
     * 添加Fpapply添加"我要扶贫"信息
     * @param fpapply
     * @return
     */
    public int addFpapply(Fpapply fpapply);

    /**
     * 根据用户id查询收到的求助信息
     * @param userid
     * @return
     */
    public List<FpSeek> queryFpSeekByUserId(String userid);

    /**
     * 根据userid返回我的所有帮扶信息
     * @param userid
     * @return
     */
    public List<Fpapply> queryFpapplyByUserId(String userid);

    /**
     * 根据编号返回帮扶状态
     * @param stateid
     * @return
     */
    public List<FpapplyState> queryFpapplyStateByStateid(String stateid);

    /**
     *根据userid返回走访信息列表
     * @param userid
     * @return
     */
    public List<FpinterView> queryFpinterViewByUserid(String userid);

    /**
     *提交走访申请
     * @param fpinterView
     * @return
     */
    public int addFpinterView(FpinterView fpinterView);

    /**
     * 根据村庄获取村民信息
     * @param villid
     * @return
     */
    public List<FpVilliager> queryFpVilliagerByVillid(String villid);

    /**
     * 发布案例
     * @param fpcase
     * @return
     */
    public int addFpcase(Fpcase fpcase);

}
