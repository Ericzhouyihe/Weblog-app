package com.zhouyihe.weblog.admin.service;

import com.zhouyihe.weblog.admin.model.vo.comment.DeleteCommentReqVO;
import com.zhouyihe.weblog.admin.model.vo.comment.ExamineCommentReqVO;
import com.zhouyihe.weblog.admin.model.vo.comment.FindCommentPageListReqVO;
import com.zhouyihe.weblog.common.utils.Response;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description 评论
 **/
public interface AdminCommentService {

    /**
     * 查询评论分页数据
     * @param findCommentPageListReqVO
     * @return
     */
    Response findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);

    /**
     * 删除评论
     * @param deleteCommentReqVO
     * @return
     */
    Response deleteComment(DeleteCommentReqVO deleteCommentReqVO);

    /**
     * 评论审核
     * @param examineCommentReqVO
     * @return
     */
    Response examine(ExamineCommentReqVO examineCommentReqVO);

}
