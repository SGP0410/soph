package com.example.soph.dao;

import com.example.soph.pojo.News;
import com.example.soph.pojo.NewsComment;
import com.example.soph.pojo.NewsType;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/30 15:42
 */
public interface NewsDao {

    /**
     * 根据类型编号查询专题新闻
     * @param dictCode
     * @return
     */
    public List<News> queryNewsByDictCode(String dictCode);

    /**
     * 获取所有新闻分类
     * @return
     */
    public List<NewsType> queryNewsType();

    /**
     * 获取所有新闻
     * @return
     */
    public List<News> queryNewsAll();

    /**
     * 根据新闻id获取评论
     * @param pressId
     * @return
     */
    public List<NewsComment> queryNewsCommentByPressId(String pressId);

    /**
     * 添加评论
     * @param comment
     * @return
     */
    public int addNewsComment(NewsComment comment);

}
