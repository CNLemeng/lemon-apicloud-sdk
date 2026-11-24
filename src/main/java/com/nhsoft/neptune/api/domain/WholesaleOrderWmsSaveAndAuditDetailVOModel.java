package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderWmsSaveAndAuditDetailVO模型
 * WMS批发销售单响应明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderWmsSaveAndAuditDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发销售单号")
    private String wholesaleOrderFid;
    @ApiCloudField(value="order_detail_num")
    private Integer orderDetailNum;
    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="order_detail_item_code")
    private String orderDetailItemCode;
    @ApiCloudField(value="order_detail_item_name")
    private String orderDetailItemName;
    @ApiCloudField(value="order_detail_item_spec")
    private String orderDetailItemSpec;
    @ApiCloudField(value="order_detail_item_unit")
    private String orderDetailItemUnit;
    @ApiCloudField(value="基本数量")
    private BigDecimal orderDetailQty;
    @ApiCloudField(value="order_detail_assist_qty")
    private BigDecimal orderDetailAssistQty;
    @ApiCloudField(value="order_detail_present_qty")
    private BigDecimal orderDetailPresentQty;
    @ApiCloudField(value="order_detail_assist_present_qty")
    private BigDecimal orderDetailAssistPresentQty;
    @ApiCloudField(value="基本单价")
    private BigDecimal orderDetailPrice;
    @ApiCloudField(value="明细金额")
    private BigDecimal orderDetailMoney;
    @ApiCloudField(value="成本单价")
    private BigDecimal orderDetailCost;
    @ApiCloudField(value="order_detail_item_matrix_num")
    private Integer orderDetailItemMatrixNum;
    @ApiCloudField(value="order_detail_commission")
    private BigDecimal orderDetailCommission;
    @ApiCloudField(value="order_detail_lot_number")
    private String orderDetailLotNumber;
    @ApiCloudField(value="order_detail_inventory_qty")
    private BigDecimal orderDetailInventoryQty;
    @ApiCloudField(value="order_detail_assist_inventory_qty")
    private BigDecimal orderDetailAssistInventoryQty;
    @ApiCloudField(value="order_detail_use_unit")
    private String orderDetailUseUnit;
    @ApiCloudField(value="常用数量")
    private BigDecimal orderDetailUseQty;
    @ApiCloudField(value="常用单价")
    private BigDecimal orderDetailUsePrice;
    @ApiCloudField(value="换算率")
    private BigDecimal orderDetailUseRate;
    @ApiCloudField(value="order_detail_sale_price")
    private BigDecimal orderDetailSalePrice;
    @ApiCloudField(value="order_detail_period")
    private String orderDetailPeriod;
    @ApiCloudField(value="order_detail_present_unit")
    private String orderDetailPresentUnit;
    @ApiCloudField(value="order_detail_present_use_qty")
    private BigDecimal orderDetailPresentUseQty;
    @ApiCloudField(value="order_detail_book_qty")
    private BigDecimal orderDetailBookQty;
    @ApiCloudField(value="order_detail_std_price")
    private BigDecimal orderDetailStdPrice;
    @ApiCloudField(value="order_detail_inventory_basic_qty")
    private BigDecimal orderDetailInventoryBasicQty;
    @ApiCloudField(value="order_detail_tare")
    private BigDecimal orderDetailTare;
    @ApiCloudField(value="账套号")
    private String systemBookCode;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="order_detail_tax_money")
    private BigDecimal orderDetailTaxMoney;
    @ApiCloudField(value="order_detail_tax_rate")
    private BigDecimal orderDetailTaxRate;
    @ApiCloudField(value="order_detail_no_tax_money")
    private BigDecimal orderDetailNoTaxMoney;
    @ApiCloudField(value="order_detail_qty_appand")
    private BigDecimal orderDetailQtyAppand;
    @ApiCloudField(value="management_style_type")
    private String managementStyleType;
    @ApiCloudField(value="order_detail_show_qty")
    private String orderDetailShowQty;
    @ApiCloudField(value="order_detail_other_tax_rate")
    private BigDecimal orderDetailOtherTaxRate;
    @ApiCloudField(value="order_detail_other_tax_money")
    private BigDecimal orderDetailOtherTaxMoney;
    @ApiCloudField(value="whole_order_kit_details")
    private List<Object> wholeOrderKitDetails;
    @ApiCloudField(value="order_detail_ordinal")
    private Integer orderDetailOrdinal;
    @ApiCloudField(value="un_allow_return")
    private Boolean unAllowReturn;
    @ApiCloudField(value="pos_item_area_size")
    private BigDecimal posItemAreaSize;
    @ApiCloudField(value="pos_item_area_weight")
    private BigDecimal posItemAreaWeight;
    @ApiCloudField(value="enable_ln_rate")
    private Boolean enableLnRate;
    @ApiCloudField(value="item_client_grade_map")
    private Object itemClientGradeMap;
    @ApiCloudField(value="policy_types")
    private List<Object> policyTypes;
    @ApiCloudField(value="order_detail_local_price")
    private BigDecimal orderDetailLocalPrice;
    @ApiCloudField(value="order_detail_local_money")
    private BigDecimal orderDetailLocalMoney;
    @ApiCloudField(value="order_detail_local_use_price")
    private BigDecimal orderDetailLocalUsePrice;
    @ApiCloudField(value="order_detail_local_tax_money")
    private BigDecimal orderDetailLocalTaxMoney;
}
