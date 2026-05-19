package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponVariantDTO模型
 * 仅读取接口返回
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponVariantDTOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="product_name")
    private String productName;
    @ApiCloudField(value="category")
    private String category;
    @ApiCloudField(value="code")
    private String code;
    @ApiCloudField(value="barcode")
    private String barcode;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="std_price")
    private BigDecimal stdPrice;
}
