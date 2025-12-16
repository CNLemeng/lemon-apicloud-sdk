package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicProductGroupVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicProductGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品分组编号", example="1")
    private Long id;
    @ApiCloudField(value="分组名称", example="零食")
    private String name;
    @ApiCloudField(value="父级编号", example="1")
    private Long parentId;
    @ApiCloudField(value="默认标记", example="true")
    private Boolean defaultFlag;
    @ApiCloudField(value="序列号", example="1")
    private Integer serialNum;
    @ApiCloudField(value="可见标记", example="true")
    private Boolean visibleFlag;
    @ApiCloudField(value="可搜索标记", example="true")
    private Boolean searchFlag;
    @ApiCloudField(value="advertisement_param")
    private BasicAdvertisementParamVOModel advertisementParam;
}
