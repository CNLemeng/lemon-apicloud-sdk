package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicAdvertisementParamVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicAdvertisementParamVOModel extends ApiCloudObject {

    @ApiCloudField(value="填充方式")
    private String fillType;
    @ApiCloudField(value="图片地址", example="https://nhsoft-mercury-staging.oss-cn-hangzhou.aliyuncs.com/amazon-base/material/image/99658/5gw7khgftuf1753412765967.png")
    private String imageUrl;
    @ApiCloudField(value="跳转地址", example="https://earth-test.nhsoft.cn/")
    private String jumpUrl;
}
