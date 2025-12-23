package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseItemImageSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseItemImageSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="是否清空图片(默认为不清空图片)", example="true")
    private Boolean clearFlag;
    @ApiCloudField(value="图片 byte 数组列表（最多支持传五张图片）", required=true)
    private List<String> imageBytes;
}
