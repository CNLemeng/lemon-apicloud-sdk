package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProductVariantBranchVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductVariantBranchVOModel extends ApiCloudObject {

    @ApiCloudField(value="product_id")
    private Long productId;
    @ApiCloudField(value="product_name")
    private String productName;
    @ApiCloudField(value="ratio", example="2.0")
    private BigDecimal ratio;
    @ApiCloudField(value="std_price", example="0.0")
    private BigDecimal stdPrice;
    @ApiCloudField(value="stop_sale", example="true")
    private Boolean stopSale;
    @ApiCloudField(value="variant_id")
    private Long variantId;
    @ApiCloudField(value="variant_inventory", example="true")
    private Boolean variantInventory;
    @ApiCloudField(value="variant_name")
    private String variantName;
    @ApiCloudField(value="variant_std_price", example="0.0")
    private BigDecimal variantStdPrice;
    @ApiCloudField(value="basic_unit")
    private String basicUnit;
    @ApiCloudField(value="branch_id")
    private Long branchId;
    @ApiCloudField(value="branch_name")
    private String branchName;
    @ApiCloudField(value="business_times")
    private List<BusinessTimeDTOModel> businessTimes;
    @ApiCloudField(value="category_id")
    private Long categoryId;
    @ApiCloudField(value="category_name")
    private String categoryName;
    @ApiCloudField(value="create_version", example="2026-05-01 00:00:00")
    private String createVersion;
    @ApiCloudField(value="enable_delivery", example="true")
    private Boolean enableDelivery;
    @ApiCloudField(value="enable_express", example="true")
    private Boolean enableExpress;
    @ApiCloudField(value="enable_self_pick", example="true")
    private Boolean enableSelfPick;
    @ApiCloudField(value="groups")
    private List<BasicInfoDTOModel> groups;
    @ApiCloudField(value="labels")
    private List<BasicInfoDTOModel> labels;
    @ApiCloudField(value="level2_price", example="0.0")
    private BigDecimal level2Price;
    @ApiCloudField(value="level3_price", example="0.0")
    private BigDecimal level3Price;
    @ApiCloudField(value="level4_price", example="0.0")
    private BigDecimal level4Price;
    @ApiCloudField(value="lining_price", example="0.0")
    private BigDecimal liningPrice;
    @ApiCloudField(value="negative_inventory", example="true")
    private Boolean negativeInventory;
    @ApiCloudField(value="on_sale", example="true")
    private Boolean onSale;
}
