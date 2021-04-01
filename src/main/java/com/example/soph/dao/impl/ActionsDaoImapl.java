package com.example.soph.dao.impl;

import com.example.soph.dao.ActionsDao;
import com.example.soph.pojo.Actioncommit;
import com.example.soph.pojo.Actions;
import com.example.soph.pojo.Actions_slide;
import com.example.soph.pojo.Actiontype;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/4/1 9:24 星期四
 */

public class ActionsDaoImapl extends BaseDao implements ActionsDao {


    @Override
    public int setqueryActionsCount(String id) {
        String sql = "update actions set count = count + 1 where id = ?";
        return update(sql,id);
    }

    @Override
    public List<Actiontype> queryTypeList() {
        String sql = "select * from actiontype";
        return queryForList(Actiontype.class,sql);
    }

    @Override
    public List<Actioncommit> queryList(String id) {
        String sql = "select * from actioncommit where id = ?";
        return queryForList(Actioncommit.class,sql,id);
    }

    @Override
    public List<Actions> queryList() {
        String sql = "select * from actions";
        return queryForList(Actions.class,sql);
    }

    @Override
    public Actions queryListid(String id) {
        String sql = "select * from actions where id = ?";
        return queryForOne(Actions.class,sql,id);
    }

    @Override
    public List<Actions_slide> queryLisSlide() {
        String sql = "select * from actions_slide";
        return queryForList(Actions_slide.class,sql);
    }

    @Override
    public int setqueryActionscommit(String id, String userid, String commitTime, String commitContent) {
        String sql = "INSERT INTO actioncommit(id,userid,commitTime,commitContent) VALUES (?,?,?,?)";
        return update(sql,id,userid,commitTime,commitContent);
    }
}
