package com.example.soph.dao;

import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/18 11:32 星期日
 */

public interface Movie_infoDao {

    public int addMovie_seat(Movie_seat movie_seat);

    public List<Movie_seat> query_movie_seat(String seatNumber);

    public List<Movie_session> query_title_name(String MovieName);

    public List<Movie_session> query_title_name(String Movietitle,String MovieName);

    /**
     * @return  查询所有影片信息
     */
    public List<Movie_info> queryInfo();

    /**
     * 查询所有评论
     * @return
     */
    public List<Movie_comment> query_comment(String Movieid);


    /**
     * 添加评论
     * @param movie_comment
     * @return
     */
    public int add_comment(Movie_comment movie_comment);


    /**
     * 查询所有看过和想看
     * @return
     */
    public List<Movie_status> query_status();


    public List<Movie_status> query_userid(String userid);

    /**
     * 添加想看和看过
     * @param movie_status
     * @return
     */
    public int add_status(Movie_status movie_status);

    /**
     * 根据影片id查询播放时间
     * @param Movieid
     * @return
     */
    public List<Movie_session> query_session(String Movieid);


    /**
     * 查询所有新闻信息
     * @return
     */
    public List<Movie_new> query_news();

    /**
     * 查询电影院地址
     * @return
     */
    public List<Movie_add> query_add();

    public List<Movie_comment> query_Movieid(String movieid);


}
