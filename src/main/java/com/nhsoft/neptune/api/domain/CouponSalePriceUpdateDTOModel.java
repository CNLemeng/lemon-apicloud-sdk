package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponSalePriceUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponSalePriceUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="barcode", required=true)
    private String barcode;
    @ApiCloudField(value="sale_price", required=true)
    private BigDecimal salePrice;
}
