package com.zhouyihe.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-08-24 17:11
 * @description 用户名或者密码为空异常
 **/
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
