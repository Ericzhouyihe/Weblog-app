package com.zhouyihe.weblog.web.service;

import com.zhouyihe.weblog.common.utils.Response;
import com.zhouyihe.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.zhouyihe.weblog.web.model.vo.category.FindCategoryListReqVO;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description 分类
 **/
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
