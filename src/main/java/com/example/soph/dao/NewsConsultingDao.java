package com.example.soph.dao;

import com.example.soph.pojo.ConsultingNews;
import com.example.soph.pojo.Consulting_news;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/9/29 15:11 星期三
 * @Description com.example.soph.dao
 */
public interface NewsConsultingDao {

    public List<ConsultingNews> queryAll();

    public int queryConsultin(String like,String id);

    public ConsultingNews queryById(String id);

}
