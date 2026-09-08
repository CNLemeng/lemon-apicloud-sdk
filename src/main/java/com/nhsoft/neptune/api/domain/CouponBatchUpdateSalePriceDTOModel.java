package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponBatchUpdateSalePriceDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponBatchUpdateSalePriceDTOModel extends ApiCloudObject {

    @ApiCloudField(value="coupons", required=true)
    private List<CouponSalePriceUpdateDTOModel> coupons;
}
