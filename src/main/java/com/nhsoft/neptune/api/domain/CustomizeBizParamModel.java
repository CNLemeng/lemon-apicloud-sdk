package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizeBizParam模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizeBizParamModel extends ApiCloudObject {

    @ApiCloudField(value="标准系统模块", example="AMA_CENTER", required=true)
    private String module;
    @ApiCloudField(value="定制接口请求方式(POST|GET)", example="POST", required=true)
    private String method;
    @ApiCloudField(value="定制接口路径", example="/inner/nhsoft.ama.branchrecord.clear", required=true)
    private String url;
    @ApiCloudField(value="定制接口参数")
    private Object bizParams;
}
