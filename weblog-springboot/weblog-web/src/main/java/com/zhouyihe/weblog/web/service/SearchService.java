package com.zhouyihe.weblog.web.service;

import com.zhouyihe.weblog.common.utils.Response;
import com.zhouyihe.weblog.web.model.vo.search.SearchArticlePageListReqVO;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description
 **/
public interface SearchService {

    /**
     * 关键词分页搜索
     * @param searchArticlePageListReqVO
     * @return
     */
    Response searchArticlePageList(SearchArticlePageListReqVO searchArticlePageListReqVO);
}
