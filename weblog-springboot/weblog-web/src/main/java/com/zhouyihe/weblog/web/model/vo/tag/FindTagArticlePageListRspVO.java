package com.zhouyihe.weblog.web.model.vo.tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:07
 * @description 标签下文章列表
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindTagArticlePageListRspVO {
    private Long id;
    private String cover;
    private String title;
    /**
     * 发布日期
     */
    private LocalDate createDate;

}