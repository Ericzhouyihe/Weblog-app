package com.zhouyihe.weblog.admin.service;

import com.zhouyihe.weblog.admin.model.vo.wiki.*;
import com.zhouyihe.weblog.common.utils.Response;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description 知识库
 **/
public interface AdminWikiService {

    /**
     * 新增知识库
     * @param addWikiReqVO
     * @return
     */
    Response addWiki(AddWikiReqVO addWikiReqVO);

    /**
     * 删除知识库
     * @param deleteWikiReqVO
     * @return
     */
    Response deleteWiki(DeleteWikiReqVO deleteWikiReqVO);

    /**
     * 知识库分页查询
     * @param findWikiPageListReqVO
     * @return
     */
    Response findWikiPageList(FindWikiPageListReqVO findWikiPageListReqVO);

    /**
     * 更新知识库置顶状态
     * @param updateWikiIsTopReqVO
     * @return
     */
    Response updateWikiIsTop(UpdateWikiIsTopReqVO updateWikiIsTopReqVO);

    /**
     * 更新知识库发布状态
     * @param updateWikiIsPublishReqVO
     * @return
     */
    Response updateWikiIsPublish(UpdateWikiIsPublishReqVO updateWikiIsPublishReqVO);

    /**
     * 更新知识库
     * @param updateWikiReqVO
     * @return
     */
    Response updateWiki(UpdateWikiReqVO updateWikiReqVO);

    /**
     * 查询知识库目录
     * @param findWikiCatalogListReqVO
     * @return
     */
    Response findWikiCatalogList(FindWikiCatalogListReqVO findWikiCatalogListReqVO);

    /**
     * 更新知识库目录
     * @param updateWikiCatalogReqVO
     * @return
     */
    Response updateWikiCatalogs(UpdateWikiCatalogReqVO updateWikiCatalogReqVO);
}