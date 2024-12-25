package com.zhouyihe.weblog.admin.convert;

import com.zhouyihe.weblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.zhouyihe.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.zhouyihe.weblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024/10/8 14:57
 * @description 博客设置转换
 **/
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);

}
