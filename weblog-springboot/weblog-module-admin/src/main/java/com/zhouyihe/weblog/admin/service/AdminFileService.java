package com.zhouyihe.weblog.admin.service;

import com.zhouyihe.weblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description
 **/
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
