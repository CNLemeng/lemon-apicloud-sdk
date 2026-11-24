package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PromotionOrderPosItemPromotionVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PromotionOrderPosItemPromotionVOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号规则为 账套号+门店号+流水号", example="99675990001392")
    private String promotionOrderNo;
    @ApiCloudField(value="由老促销单据转换而来时才有值", example="996750009900002697")
    private String oldPolicyNo;
    @ApiCloudField(value="promotion_order_name", example="单品特价")
    private String promotionOrderName;
    @ApiCloudField(value="promotion_order_type", example="POLICY_PROMOTION")
    private String promotionOrderType;
    @ApiCloudField(value="promotion_order_sub_type_name", example="单品特价")
    private String promotionOrderSubTypeName;
    @ApiCloudField(value="promotion_order_detail_scope", example="ITEM")
    private String promotionOrderDetailScope;
    @ApiCloudField(value="促销商品范围为 ITEM 时才有值", example="9967500002495")
    private Long specNum;
    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="促销商品范围为 BRAND 时为明细上的品牌", example="CC的品牌A")
    private String itemBrand;
    @ApiCloudField(value="促销商品范围为 CATEGORY 时为明细上的类别代码", example="4")
    private String itemCategoryCode;
    @ApiCloudField(value="item_category_name", example="CC的标准")
    private String itemCategoryName;
    @ApiCloudField(value="促销商品范围为 SUPPLIER 时才有值", example="996750274")
    private Integer supplierNum;
    @ApiCloudField(value="supplier_name", example="测试供应商")
    private String supplierName;
    @ApiCloudField(value="促销方式为特价、一口价时有值，折扣类促销为空", example="7.77")
    private BigDecimal specialPrice;
    @ApiCloudField(value="超量、阶梯类促销的起始数量", example="3.0")
    private BigDecimal minAmount;
    @ApiCloudField(value="0 表示不限量", example="6.0")
    private BigDecimal billLimit;
    @ApiCloudField(value="promotion_order_detail_cancel", example="false")
    private Boolean promotionOrderDetailCancel;
    @ApiCloudField(value="branch_apply_type", example="SPECIFIED")
    private String branchApplyType;
    @ApiCloudField(value="except_flag 为 true 表示该门店为例外门店")
    private List<AppliedBranchDTOModel> appliedBranches;
    @ApiCloudField(value="promotion_order_start_time", example="2026-10-01 00:00:00")
    private String promotionOrderStartTime;
    @ApiCloudField(value="promotion_order_end_time", example="2026-10-31 23:59:59")
    private String promotionOrderEndTime;
    @ApiCloudField(value="单据未按周配置生效周期时为空", example="星期一、二、六")
    private String weekCycle;
}
