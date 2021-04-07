package com.example.soph.dao.impl;

import com.example.soph.dao.FpDao;
import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/4/1 9:55
 */
public class FpDaoImpl extends BaseDao implements FpDao {


    @Override
    public List<FpNews> queryFpNewsAll() {
        String sql = "select * from fpnews";
        return queryForList(FpNews.class , sql);
    }

    @Override
    public List<Fpcase> queryFpcaseAll() {
        String sql = "select * from fpcase";
        return queryForList(Fpcase.class , sql);
    }

    @Override
    public int updateFpcaseThumbup(String caseid) {
        String sql = "update fpcase set thumbup = thumbup + 1 where caseid = ?";
        return update(sql , caseid);
    }

    @Override
    public List<FpVilliage> queryFpVilliageAll() {
        String sql = "select * from fpvilliage";
        return queryForList(FpVilliage.class , sql);
    }

    @Override
    public FpVilliageDetail queryFpVilliageDetailByVillid(String villid) {
        String sql = "select * from fpvilliage_detail where villid = ?";
        return queryForOne(FpVilliageDetail.class , sql , villid);
    }

    @Override
    public int addFpapply(Fpapply fpapply) {
        String sql = "insert into fpapply(applytitle , applydesc , applycontent ," +
                " villid , starttime , helpdesc , applystate , userid) value(?,?,?,?,?,?,?,?)";
        return update(sql ,
                fpapply.getApplytitle() ,
                fpapply.getApplydesc() ,
                fpapply.getApplycontent(),
                fpapply.getVillid() ,
                fpapply.getStarttime(),
                fpapply.getHelpdesc(),
                fpapply.getApplystate() ,
                fpapply.getUserid()
                );
    }

    @Override
    public List<FpSeek> queryFpSeekByUserId(String userid) {
        String sql = "select * from fpseek where userid = ?";
        return queryForList(FpSeek.class , sql , userid);
    }

    @Override
    public List<Fpapply> queryFpapplyByUserId(String userid) {
        String sql = "select * from fpapply where userid = ?";
        return queryForList(Fpapply.class , sql , userid);
    }

    @Override
    public List<FpapplyState> queryFpapplyStateByStateid(String stateid) {
        String sql = "select * from fpapplystate where stateid = ?";
        return queryForList(FpapplyState.class , sql , stateid);
    }

    @Override
    public List<FpinterView> queryFpinterViewByUserid(String userid) {
        String sql = "select * from fpinterview where userid = ?";
        return queryForList(FpinterView.class , sql , userid);
    }

    @Override
    public int addFpinterView(FpinterView fpinterView) {
        String sql = "insert into fpinterview(villiagerid , starttime , endtime , intent , userid) " +
                "values(?,?,?,?,?)";
        return update(sql ,
                fpinterView.getVilliagerid() ,
                fpinterView.getStarttime() ,
                fpinterView.getEndtime() ,
                fpinterView.getIntent() ,
                fpinterView.getUserid());
    }

    @Override
    public List<FpVilliager> queryFpVilliagerByVillid(String villid) {
        String sql = "select * from fpvilliager where villid = ?";
        return queryForList(FpVilliager.class , sql , villid);
    }

    @Override
    public int addFpcase(Fpcase fpcase) {
        //{casetitle:"111",casepicture:"a.jpg",reporttime:"2020-10-2","userid":1,"caseContent":""}
        String sql = "insert into fpcase(casetitle , casepicture , reporttime , userid , caseContent) " +
                "values(?,?,?,?,?)";
        return update(sql ,
                fpcase.getCasetitle() ,
                fpcase.getCasepicture() ,
                fpcase.getReporttime() ,
                fpcase.getUserid() ,
                fpcase.getCaseContent());
    }
}
