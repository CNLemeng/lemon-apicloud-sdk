package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VipLevelFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipLevelFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_id", example="9965800000219")
    private Long customerId;
    @ApiCloudField(value="compute_price", example="true")
    private Boolean computePrice;
}
