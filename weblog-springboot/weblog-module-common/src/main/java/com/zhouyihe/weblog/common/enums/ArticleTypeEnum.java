package com.zhouyihe.weblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-08-15 10:33
 * @description 文章类型
 **/
@Getter
@AllArgsConstructor
public enum ArticleTypeEnum {

    NORMAL(1, "普通"),
    WIKI(2, "收录于知识库");

    private Integer value;
    private String description;

}
