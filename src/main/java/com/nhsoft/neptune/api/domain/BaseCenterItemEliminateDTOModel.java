package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseCenterItemEliminateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseCenterItemEliminateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", required=true)
    private Long itemNum;
    @ApiCloudField(value="eliminate_flag", required=true)
    private Boolean eliminateFlag;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
