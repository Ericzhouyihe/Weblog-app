package com.zhouyihe.weblog.admin.model.vo.wiki;

import com.zhouyihe.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:07
 * @description 知识库分页
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "查询知识库分页数据入参 VO")
public class FindWikiPageListReqVO extends BasePageQuery {

    /**
     * 知识库标题
     */
    private String title;

    /**
     * 发布的起始日期
     */
    private LocalDate startDate;

    /**
     * 发布的结束日期
     */
    private LocalDate endDate;

}