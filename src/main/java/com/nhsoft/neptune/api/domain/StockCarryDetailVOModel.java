package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StockCarryDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StockCarryDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_code")
    private String itemCode;
    @ApiCloudField(value="item_name")
    private String itemName;
    @ApiCloudField(value="item_category_code")
    private String itemCategoryCode;
    @ApiCloudField(value="item_category")
    private String itemCategory;
    @ApiCloudField(value="item_barcode")
    private String itemBarcode;
    @ApiCloudField(value="del_tag")
    private Boolean delTag;
    @ApiCloudField(value="end_money_no_tax")
    private BigDecimal endMoneyNoTax;
    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="begin_amount")
    private BigDecimal beginAmount;
    @ApiCloudField(value="begin_money")
    private BigDecimal beginMoney;
    @ApiCloudField(value="receive_amount")
    private BigDecimal receiveAmount;
    @ApiCloudField(value="receive_money")
    private BigDecimal receiveMoney;
    @ApiCloudField(value="return_amount")
    private BigDecimal returnAmount;
    @ApiCloudField(value="return_money")
    private BigDecimal returnMoney;
    @ApiCloudField(value="adjustment_in_amount")
    private BigDecimal adjustmentInAmount;
    @ApiCloudField(value="adjustment_in_money")
    private BigDecimal adjustmentInMoney;
    @ApiCloudField(value="cot_adjustment_money")
    private BigDecimal cotAdjustmentMoney;
    @ApiCloudField(value="allocation_in_amount")
    private BigDecimal allocationInAmount;
    @ApiCloudField(value="allocation_in_money")
    private BigDecimal allocationInMoney;
    @ApiCloudField(value="assemble_split_in_amount")
    private BigDecimal assembleSplitInAmount;
    @ApiCloudField(value="assemble_split_in_money")
    private BigDecimal assembleSplitInMoney;
    @ApiCloudField(value="transfer_in_amount")
    private BigDecimal transferInAmount;
    @ApiCloudField(value="transfer_in_money")
    private BigDecimal transferInMoney;
    @ApiCloudField(value="check_order_in_amount")
    private BigDecimal checkOrderInAmount;
    @ApiCloudField(value="check_order_in_money")
    private BigDecimal checkOrderInMoney;
    @ApiCloudField(value="process_in_amount")
    private BigDecimal processInAmount;
    @ApiCloudField(value="process_in_money")
    private BigDecimal processInMoney;
    @ApiCloudField(value="in_amount")
    private BigDecimal inAmount;
    @ApiCloudField(value="in_money")
    private BigDecimal inMoney;
    @ApiCloudField(value="adjustment_money")
    private BigDecimal adjustmentMoney;
    @ApiCloudField(value="cost")
    private BigDecimal cost;
    @ApiCloudField(value="cost_memo")
    private String costMemo;
    @ApiCloudField(value="adjustment_out_amount")
    private BigDecimal adjustmentOutAmount;
    @ApiCloudField(value="adjustment_out_money")
    private BigDecimal adjustmentOutMoney;
    @ApiCloudField(value="allocation_out_amount")
    private BigDecimal allocationOutAmount;
    @ApiCloudField(value="allocation_out_money")
    private BigDecimal allocationOutMoney;
    @ApiCloudField(value="assemble_split_out_amount")
    private BigDecimal assembleSplitOutAmount;
    @ApiCloudField(value="assemble_split_out_money")
    private BigDecimal assembleSplitOutMoney;
    @ApiCloudField(value="transfer_out_amount")
    private BigDecimal transferOutAmount;
    @ApiCloudField(value="transfer_out_money")
    private BigDecimal transferOutMoney;
    @ApiCloudField(value="transfer_out_in_amount")
    private BigDecimal transferOutInAmount;
    @ApiCloudField(value="transfer_out_in_money")
    private BigDecimal transferOutInMoney;
    @ApiCloudField(value="check_order_out_amount")
    private BigDecimal checkOrderOutAmount;
    @ApiCloudField(value="check_order_out_money")
    private BigDecimal checkOrderOutMoney;
    @ApiCloudField(value="wholesale_amount")
    private BigDecimal wholesaleAmount;
    @ApiCloudField(value="wholesale_money")
    private BigDecimal wholesaleMoney;
    @ApiCloudField(value="wholesale_return_amount")
    private BigDecimal wholesaleReturnAmount;
    @ApiCloudField(value="wholesale_return_money")
    private BigDecimal wholesaleReturnMoney;
    @ApiCloudField(value="pos_amount")
    private BigDecimal posAmount;
    @ApiCloudField(value="pos_money")
    private BigDecimal posMoney;
    @ApiCloudField(value="point_amount")
    private BigDecimal pointAmount;
    @ApiCloudField(value="point_money")
    private BigDecimal pointMoney;
    @ApiCloudField(value="process_amount")
    private BigDecimal processAmount;
    @ApiCloudField(value="process_money")
    private BigDecimal processMoney;
    @ApiCloudField(value="cost_adjustment_out_money")
    private BigDecimal costAdjustmentOutMoney;
    @ApiCloudField(value="stock_carry_money")
    private BigDecimal stockCarryMoney;
    @ApiCloudField(value="other_inout_share_money")
    private BigDecimal otherInoutShareMoney;
    @ApiCloudField(value="out_amount")
    private BigDecimal outAmount;
    @ApiCloudField(value="out_money")
    private BigDecimal outMoney;
    @ApiCloudField(value="end_amount")
    private BigDecimal endAmount;
    @ApiCloudField(value="end_money")
    private BigDecimal endMoney;
    @ApiCloudField(value="diff_amount")
    private BigDecimal diffAmount;
    @ApiCloudField(value="diff_money")
    private BigDecimal diffMoney;
}
