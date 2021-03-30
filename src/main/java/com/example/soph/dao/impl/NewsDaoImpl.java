package com.example.soph.dao.impl;

import com.example.soph.dao.NewsDao;
import com.example.soph.pojo.News;
import com.example.soph.pojo.NewsComment;
import com.example.soph.pojo.NewsType;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/30 15:43
 */
public class NewsDaoImpl extends BaseDao implements NewsDao {

    @Override
    public List<News> queryNewsByDictCode(String dictCode) {
        String sql = "select * from news where dictCode = ?";
        return queryForList(News.class , sql , dictCode);
    }

    @Override
    public List<NewsType> queryNewsType() {
        String sql = "select * from news_type";
        return queryForList(NewsType.class , sql);
    }

    @Override
    public List<News> queryNewsAll() {
        String sql = "select * from news";
        return queryForList(News.class , sql);
    }

    @Override
    public List<NewsComment> queryNewsCommentByPressId(String pressId) {
        String sql = "select * from new_comment where pressId = ?";
        return queryForList(NewsComment.class , sql , pressId);
    }

    @Override
    public int addNewsComment(NewsComment comment) {
        String sql = "insert into new_comment(userId , pressId , content , createTime) values(?,?,?,?)";
        return update(sql , comment.getUserId() ,
                comment.getPressId() ,
                comment.getContent() ,
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
