package com.zhouyihe.weblog.common.exception;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-08-15 9:54
 * @description 通用异常接口
 **/
public interface BaseExceptionInterface {
    String getErrorCode();

    String getErrorMessage();
}
