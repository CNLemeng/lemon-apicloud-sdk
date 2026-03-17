package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemFlagIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemFlagIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品查询模板编号", example="1", required=true)
    private Integer itemFlagNum;
}
