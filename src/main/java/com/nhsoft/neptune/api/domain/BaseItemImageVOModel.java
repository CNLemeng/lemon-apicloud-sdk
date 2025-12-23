package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseItemImageVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseItemImageVOModel extends ApiCloudObject {

    @ApiCloudField(value="图片编号", example="9965800000342")
    private Long id;
    @ApiCloudField(value="图片名称", example="098cdc6a-427d-4005-b3c9-c26297be2322.jpg")
    private String name;
    @ApiCloudField(value="图片地址", example="https://test-mer-image.oss-cn-hangzhou.aliyuncs.com/amazon-base/material/image/99658/098cdc6a-427d-4005-b3c9-c26297be2322.jpg")
    private String url;
    @ApiCloudField(value="图片视频地址", example="https://test-mer-image.oss-cn-hangzhou.aliyuncs.com/amazon-base/material/video/99658/098cdc6a-427d-4005-b3c9-c26297be2322.mp4")
    private String videoUrl;
    @ApiCloudField(value="图片编号", example="9965800000342")
    private String imageId;
    @ApiCloudField(value="文件类型", example="IMAGE")
    private String type;
    @ApiCloudField(value="图片大小(KB)", example="35408")
    private String size;
    @ApiCloudField(value="创建时间", example="2023-05-09 00:00:00")
    private String createdAt;
    @ApiCloudField(value="修改时间", example="2023-05-09 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="是否删除", example="false")
    private Boolean deletedFlag;
}
