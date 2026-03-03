package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountConfigVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountConfigVOModel extends ApiCloudObject {

    @ApiCloudField(value="config")
    private List<DiscountConfigDetailVOModel> config;
}
