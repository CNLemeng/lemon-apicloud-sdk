package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseCenterBrandVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseCenterBrandVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="9965800000005")
    private Long id;
    @ApiCloudField(value="brand_code", example="100033")
    private String brandCode;
    @ApiCloudField(value="brand_name", example="清风")
    private String brandName;
    @ApiCloudField(value="brand_pinyin", example="QF")
    private String brandPinyin;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="created_by", example="268418")
    private Integer createdBy;
    @ApiCloudField(value="deleted_flag", example="true")
    private Boolean deletedFlag;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="updated_by", example="268396")
    private Integer updatedBy;
    @ApiCloudField(value="brand_img_url", example="https://test-mer-image.oss-cn-hangzhou.aliyuncs.com/amazon-base/material/image/99658/iwEcAqNwbmcDAQTRAbYF0QEOBrD4cEgTXhoocwhFIRYfUfQAB9MAAAAAmJ4-pQgACaJpbQoAC9IAA-T3.png")
    private String brandImgUrl;
}
