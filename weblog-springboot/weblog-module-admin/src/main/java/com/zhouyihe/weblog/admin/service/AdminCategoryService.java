package com.zhouyihe.weblog.admin.service;

import com.zhouyihe.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.zhouyihe.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.zhouyihe.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.zhouyihe.weblog.common.utils.PageResponse;
import com.zhouyihe.weblog.common.utils.Response;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description
 **/
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryPageList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();

}
