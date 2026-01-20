package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionDateToUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionDateToUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销特价结束日期（yyyy-MM-dd）", example="2021-01-01", required=true)
    private String policyPromotionDateTo;
    @ApiCloudField(value="促销单号", example="4344990002112", required=true)
    private String policyNo;
}
