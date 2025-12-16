package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicResourceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicResourceVOModel extends ApiCloudObject {

    @ApiCloudField(value="资源编号", example="1")
    private Long id;
    @ApiCloudField(value="资源地址", example="https://image.nhsoft.cn/static/default-empty-image.png")
    private String url;
}
