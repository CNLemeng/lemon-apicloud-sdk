package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsOrderDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="product_id", example="MIX-PROD-001", required=true)
    private String productId;
    @ApiCloudField(value="spec_id", example="MIX-SKU-001", required=true)
    private String specId;
    @ApiCloudField(value="product_name", example="测试商品A", required=true)
    private String productName;
    @ApiCloudField(value="spec_name", example="标准份")
    private String specName;
    @ApiCloudField(value="erp_product_id", example="278")
    private String erpProductId;
    @ApiCloudField(value="amount", example="100", required=true)
    private Integer amount;
    @ApiCloudField(value="price", example="100")
    private Integer price;
    @ApiCloudField(value="total_money", example="100")
    private Integer totalMoney;
    @ApiCloudField(value="payment_money", example="100")
    private Integer paymentMoney;
}
