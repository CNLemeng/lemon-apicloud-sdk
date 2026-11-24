package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderWmsSaveAndAuditBookVO模型
 * WMS批发销售单关联批发订单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderWmsSaveAndAuditBookVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发订单号")
    private String wholesaleBookFid;
    @ApiCloudField(value="客户编号")
    private String clientFid;
    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
    @ApiCloudField(value="账套号")
    private String systemBookCode;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="wholesale_book_date")
    private String wholesaleBookDate;
    @ApiCloudField(value="wholesale_book_deadline")
    private String wholesaleBookDeadline;
    @ApiCloudField(value="wholesale_book_purchase_date")
    private String wholesaleBookPurchaseDate;
    @ApiCloudField(value="wholesale_book_seller")
    private String wholesaleBookSeller;
    @ApiCloudField(value="state")
    private WholesaleOrderWmsSaveAndAuditStateVOModel state;
    @ApiCloudField(value="wholesale_book_creator")
    private String wholesaleBookCreator;
    @ApiCloudField(value="wholesale_book_create_time")
    private String wholesaleBookCreateTime;
    @ApiCloudField(value="wholesale_book_auditor")
    private String wholesaleBookAuditor;
    @ApiCloudField(value="wholesale_book_audit_time")
    private String wholesaleBookAuditTime;
    @ApiCloudField(value="wholesale_book_transfer_flag")
    private Boolean wholesaleBookTransferFlag;
    @ApiCloudField(value="wholesale_book_total_money")
    private BigDecimal wholesaleBookTotalMoney;
    @ApiCloudField(value="wholesale_book_pre_money")
    private BigDecimal wholesaleBookPreMoney;
    @ApiCloudField(value="region_num")
    private Integer regionNum;
    @ApiCloudField(value="wholesale_book_inner_no")
    private String wholesaleBookInnerNo;
    @ApiCloudField(value="wholesale_book_last_edit_time")
    private String wholesaleBookLastEditTime;
    @ApiCloudField(value="wholesale_book_sale_state")
    private String wholesaleBookSaleState;
    @ApiCloudField(value="wholesale_book_sale_sub_state")
    private String wholesaleBookSaleSubState;
    @ApiCloudField(value="wholesale_book_audit_bizday")
    private String wholesaleBookAuditBizday;
    @ApiCloudField(value="wholesale_book_department")
    private String wholesaleBookDepartment;
    @ApiCloudField(value="wholesale_book_last_editor")
    private String wholesaleBookLastEditor;
    @ApiCloudField(value="wholesale_book_tax_money")
    private BigDecimal wholesaleBookTaxMoney;
    @ApiCloudField(value="wholesale_book_no_tax_money")
    private BigDecimal wholesaleBookNoTaxMoney;
    @ApiCloudField(value="sale_order_item_count")
    private Integer saleOrderItemCount;
    @ApiCloudField(value="批发订单明细")
    private List<Object> wholesaleBookDetails;
    @ApiCloudField(value="order_source")
    private String orderSource;
    @ApiCloudField(value="wholesale_book_transfer_type")
    private String wholesaleBookTransferType;
    @ApiCloudField(value="wholesale_book_receivor")
    private String wholesaleBookReceivor;
    @ApiCloudField(value="wholesale_book_phone")
    private String wholesaleBookPhone;
    @ApiCloudField(value="wholesale_book_shipment_status")
    private String wholesaleBookShipmentStatus;
    @ApiCloudField(value="object_count")
    private Integer objectCount;
    @ApiCloudField(value="wholesale_book_lock")
    private Boolean wholesaleBookLock;
    @ApiCloudField(value="allow_nested_values")
    private Boolean allowNestedValues;
    @ApiCloudField(value="current_price_flag")
    private Boolean currentPriceFlag;
    @ApiCloudField(value="can_be_paid")
    private Boolean canBePaid;
    @ApiCloudField(value="can_be_paid_money")
    private BigDecimal canBePaidMoney;
    @ApiCloudField(value="confirmed")
    private Boolean confirmed;
    @ApiCloudField(value="supplier_transfer_state")
    private Integer supplierTransferState;
    @ApiCloudField(value="from_app")
    private Boolean fromApp;
    @ApiCloudField(value="service_tax_money")
    private BigDecimal serviceTaxMoney;
    @ApiCloudField(value="汇率")
    private BigDecimal exchangeRate;
    @ApiCloudField(value="book_local_total_money")
    private BigDecimal bookLocalTotalMoney;
    @ApiCloudField(value="deposit_basket_details")
    private List<Object> depositBasketDetails;
    @ApiCloudField(value="rounding_rule")
    private Integer roundingRule;
    @ApiCloudField(value="金额精度")
    private BigDecimal precision;
    @ApiCloudField(value="local_rounding_rule")
    private Integer localRoundingRule;
    @ApiCloudField(value="本币金额精度")
    private BigDecimal localPrecision;
    @ApiCloudField(value="manual_purchase_date")
    private Boolean manualPurchaseDate;
    @ApiCloudField(value="ignore_credit")
    private Boolean ignoreCredit;
    @ApiCloudField(value="fee_customs")
    private List<Object> feeCustoms;
    @ApiCloudField(value="settlement_client_fid")
    private String settlementClientFid;
    @ApiCloudField(value="sale_state")
    private String saleState;
    @ApiCloudField(value="track_order_state")
    private String trackOrderState;
}
