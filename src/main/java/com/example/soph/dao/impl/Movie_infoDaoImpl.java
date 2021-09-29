package com.example.soph.dao.impl;

import com.example.soph.dao.Movie_infoDao;
import com.example.soph.pojo.*;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/7/18 11:35 星期日
 */

public class Movie_infoDaoImpl extends BaseDao implements Movie_infoDao {


    @Override
    public int addMovie_seat(Movie_seat movie_seat) {
        String sql = "insert into movie_seat(seatNumber,session) values(?,?)";
        return update(sql,
                movie_seat.getSeatNumber(),
                movie_seat.getSession()
                );
    }

    @Override
    public List<Movie_seat> query_movie_seat(String seatNumber) {
        String sql = "select * from movie_seat where seatNumber = ?";
        return queryForList(Movie_seat.class,sql,seatNumber);
    }

    @Override
    public List<Movie_session> query_title_name(String MovieName) {
        String sql = "select * from movie_session where MovieName = ?";
        return queryForList(Movie_session.class, sql, MovieName);
    }

    @Override
    public List<Movie_session> query_title_name(String Movietitle, String MovieName) {
        String sql = "select * from movie_session where Movietitle = ? AND MovieName = ?";
        return queryForList(Movie_session.class, sql, Movietitle, MovieName);
    }

    /**
     * @return 查询所有影片信息
     */
    @Override
    public List<Movie_info> queryInfo() {
        String sql = "select * from movie_info";
        return queryForList(Movie_info.class, sql);
    }

    @Override
    public List<Movie_comment> query_comment(String Movieid) {
        String sql = "select * from movie_comment where Movieid = ?";
        return queryForList(Movie_comment.class, sql, Movieid);
    }

    /**
     * 添加评论
     *
     * @param movie_comment
     * @return
     */
    @Override
    public int add_comment(Movie_comment movie_comment) {
        String sql = "insert into movie_comment(Movieid,mark,conment,conmentTime,userId,image,username,dianzan) values(?,?,?,?,?,?,?,?)";
        return update(sql,
                movie_comment.getMovieid(),
                movie_comment.getMark(),
                movie_comment.getConment(),
                movie_comment.getConmentTime(),
                movie_comment.getUserId(),
                movie_comment.getImage(),
                movie_comment.getUsername(),
                movie_comment.getDianzan()
        );
    }

    /**
     * 查询所有看过和想看
     *
     * @return
     */
    @Override
    public List<Movie_status> query_status() {
        String sql = "select * from movie_status";
        return queryForList(Movie_status.class, sql);
    }

    @Override
    public List<Movie_status> query_userid(String userid) {
        String sql = "select * from movie_status where userid = ?";
        return queryForList(Movie_status.class, sql, userid);
    }

    /**
     * 添加看过和想看
     *
     * @param movie_status
     * @return
     */
    @Override
    public int add_status(Movie_status movie_status) {
        String sql = "insert into movie_status(movieid,status,statusmsg,userid,imag) values(?,?,?,?,?)";
        return update(sql,
                movie_status.getMovieid(),
                movie_status.getStatus(),
                movie_status.getStatusmsg(),
                movie_status.getUserid(),
                movie_status.getImag()
        );
    }

    /**
     * 通过影片id查询影院
     *
     * @param Movieid
     * @return
     */
    @Override
    public List<Movie_session> query_session(String Movieid) {
        String sql = "select * from movie_session where Movieid = ?";
        return queryForList(Movie_session.class, sql, Movieid);
    }

    /**
     * 查询所有新闻
     *
     * @return
     */
    @Override
    public List<Movie_new> query_news() {
        String sql = "select * from movie_new";
        return queryForList(Movie_new.class, sql);
    }

    @Override
    public List<Movie_add> query_add() {
        String sql = "select * from movie_add";
        return queryForList(Movie_add.class, sql);
    }

    @Override
    public List<Movie_comment> query_Movieid(String movieid) {
        String sql = "select * from movie_comment where Movieid = ?";
        return queryForList(Movie_comment.class, sql, movieid);
    }


}
