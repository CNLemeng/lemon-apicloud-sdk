package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemLatestInPriceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemLatestInPriceVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="price")
    private BigDecimal price;
}
