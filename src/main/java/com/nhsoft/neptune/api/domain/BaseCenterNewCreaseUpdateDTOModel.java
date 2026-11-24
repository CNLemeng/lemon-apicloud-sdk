package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseCenterNewCreaseUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseCenterNewCreaseUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_nums", example="[1]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="new_crease", example="true", required=true)
    private Boolean newCrease;
}
