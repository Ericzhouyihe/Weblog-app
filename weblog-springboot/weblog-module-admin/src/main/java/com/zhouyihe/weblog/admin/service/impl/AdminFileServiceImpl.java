package com.zhouyihe.weblog.admin.service.impl;

import com.zhouyihe.weblog.admin.model.vo.file.UploadFileRspVO;
import com.zhouyihe.weblog.admin.service.AdminFileService;
import com.zhouyihe.weblog.admin.utils.MinioUtil;
import com.zhouyihe.weblog.common.enums.ResponseCodeEnum;
import com.zhouyihe.weblog.common.exception.BizException;
import com.zhouyihe.weblog.common.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ZhouYihe 1552951165@qq.com
 * @create 2024-09-15 14:03
 * @description 文件上传
 **/
@Service
@Slf4j
public class AdminFileServiceImpl implements AdminFileService {
    
    @Autowired
    private MinioUtil minioUtil;
    
    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @Override
    public Response uploadFile(MultipartFile file) {
        try {
            // 上传文件
            String url = minioUtil.uploadFile(file);
            
            // 构建成功返参，将图片的访问链接返回
            return Response.success(UploadFileRspVO.builder().url(url).build());
        } catch (Exception e) {
            log.error("==> 上传文件至 Minio 错误: ", e);
            // 手动抛出业务异常，提示 “文件上传失败”
            throw new BizException(ResponseCodeEnum.FILE_UPLOAD_FAILED);
        }
    }
}
