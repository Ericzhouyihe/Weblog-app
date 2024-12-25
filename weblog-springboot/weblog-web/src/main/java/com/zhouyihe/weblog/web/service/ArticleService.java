package com.zhouyihe.weblog.web.service;

import com.zhouyihe.weblog.common.utils.Response;
import com.zhouyihe.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.zhouyihe.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description 文章
 **/
public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);

}
