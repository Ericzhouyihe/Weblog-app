package com.zhouyihe.weblog.admin.convert;

import com.zhouyihe.weblog.admin.model.vo.comment.FindCommentPageListRspVO;
import com.zhouyihe.weblog.common.domain.dos.CommentDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024/10/8 14:57
 * @description 评论实体类转换
 **/
@Mapper
public interface CommentConvert {
    /**
     * 初始化 convert 实例
     */
    CommentConvert INSTANCE = Mappers.getMapper(CommentConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindCommentPageListRspVO convertDO2VO(CommentDO bean);

}
