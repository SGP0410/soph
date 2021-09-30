package com.example.soph.dao.impl;

import com.example.soph.dao.NewsConsultingDao;
import com.example.soph.pojo.ConsultingNews;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/9/29 15:11 星期三
 * @Description com.example.soph.dao.impl
 */
public class NewsConsultingDaoImpl extends BaseDao implements NewsConsultingDao {

    @Override
    public List<ConsultingNews> queryAll() {
        String sql = "select * from consulting_news";
        return queryForList(ConsultingNews.class, sql);
    }

    @Override
    public int queryConsultin(String like, String id) {
        String sql = "UPDATE consulting_news SET `like` = ? WHERE id = ?";
        return update(sql, like, id);
    }

    @Override
    public ConsultingNews queryById(String id) {
        String sql = "select * from consulting_news where id = ?";
        return queryForOne(ConsultingNews.class, sql, id);
    }


}
