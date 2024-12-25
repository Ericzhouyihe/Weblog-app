package com.zhouyihe.weblog.web.service;

import com.zhouyihe.weblog.common.utils.Response;
import com.zhouyihe.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description 归档文章
 **/
public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
