package com.zhouyihe.weblog.admin.service;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description
 **/
public interface AdminStatisticsService {

    /**
     * 统计各分类下文章总数
     */
    void statisticsCategoryArticleTotal();

    /**
     * 统计各标签下文章总数
     */
    void statisticsTagArticleTotal();
}
