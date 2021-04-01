package com.example.soph.dao;

import com.example.soph.pojo.Actioncommit;
import com.example.soph.pojo.Actions;
import com.example.soph.pojo.Actions_slide;
import com.example.soph.pojo.Actiontype;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/4/1 9:24 星期四
 */

public interface ActionsDao {

    public int setqueryActionsCount(String id);

    public List<Actiontype> queryTypeList();

    public List<Actioncommit> queryList(String id);

    public List<Actions> queryList();

    public Actions queryListid(String id);

    public List<Actions_slide> queryLisSlide();

    public int setqueryActionscommit(String id, String userid, String commitTime, String commitContent);

}
