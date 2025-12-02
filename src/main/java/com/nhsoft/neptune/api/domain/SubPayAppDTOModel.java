package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SubPayAppDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SubPayAppDTOModel extends ApiCloudObject {

    @ApiCloudField(value="所属分组", example="分组一")
    private String groupName;
    @ApiCloudField(value="外部子商户号", example="2072001")
    private String outSubId;
    @ApiCloudField(value="子商户号", example="1501")
    private String subAppId;
    @ApiCloudField(value="子商户名称", example="测试门店一")
    private String subAppName;
}
