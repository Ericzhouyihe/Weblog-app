package com.zhouyihe.weblog.common.model;

import lombok.Data;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-19 8:54
 * @description
 **/
@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;
    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}
