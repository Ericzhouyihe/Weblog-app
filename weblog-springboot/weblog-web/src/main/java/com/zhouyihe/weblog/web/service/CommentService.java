package com.zhouyihe.weblog.web.service;

import com.zhouyihe.weblog.common.utils.Response;
import com.zhouyihe.weblog.web.model.vo.comment.FindCommentListReqVO;
import com.zhouyihe.weblog.web.model.vo.comment.FindQQUserInfoReqVO;
import com.zhouyihe.weblog.web.model.vo.comment.PublishCommentReqVO;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description 评论
 **/
public interface CommentService {

    /**
     * 根据 QQ 号获取用户信息
     * @param findQQUserInfoReqVO
     * @return
     */
    Response findQQUserInfo(FindQQUserInfoReqVO findQQUserInfoReqVO);

    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response publishComment(PublishCommentReqVO publishCommentReqVO);

    /**
     * 查询页面所有评论
     * @param findCommentListReqVO
     * @return
     */
    Response findCommentList(FindCommentListReqVO findCommentListReqVO);
}
