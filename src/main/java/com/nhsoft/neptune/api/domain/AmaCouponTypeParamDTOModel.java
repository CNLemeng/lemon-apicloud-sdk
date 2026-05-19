package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AmaCouponTypeParamDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AmaCouponTypeParamDTOModel extends ApiCloudObject {

    @ApiCloudField(value="deduct_amount")
    private BigDecimal deductAmount;
    @ApiCloudField(value="all_item")
    private Boolean allItem;
    @ApiCloudField(value="payment_types")
    private String paymentTypes;
    @ApiCloudField(value="ticket_limit_amount")
    private Integer ticketLimitAmount;
    @ApiCloudField(value="ticket_limit_amount_loop")
    private Boolean ticketLimitAmountLoop;
    @ApiCloudField(value="policy_promotion_quantity_cannot_discount")
    private Boolean policyPromotionQuantityCannotDiscount;
    @ApiCloudField(value="policy_promotion_money_cannot_discount")
    private Boolean policyPromotionMoneyCannotDiscount;
    @ApiCloudField(value="policy_discount_cannot_discount")
    private Boolean policyDiscountCannotDiscount;
    @ApiCloudField(value="policy_present_cannot_discount")
    private Boolean policyPresentCannotDiscount;
    @ApiCloudField(value="except_promotion_items")
    private Boolean exceptPromotionItems;
    @ApiCloudField(value="cannot_use_with_card_discount")
    private Boolean cannotUseWithCardDiscount;
    @ApiCloudField(value="enable_manual_changed_discount")
    private Boolean enableManualChangedDiscount;
    @ApiCloudField(value="pack_promotional_items_discount")
    private Boolean packPromotionalItemsDiscount;
    @ApiCloudField(value="time_promotional_items_discount")
    private Boolean timePromotionalItemsDiscount;
    @ApiCloudField(value="code_promotional_items_discount")
    private Boolean codePromotionalItemsDiscount;
    @ApiCloudField(value="label_promotional_items_discount")
    private Boolean labelPromotionalItemsDiscount;
    @ApiCloudField(value="limit_time_promotional_items_discount")
    private Boolean limitTimePromotionalItemsDiscount;
    @ApiCloudField(value="money_except_promotion_items")
    private Boolean moneyExceptPromotionItems;
    @ApiCloudField(value="manual_changed_include_min_money")
    private Boolean manualChangedIncludeMinMoney;
    @ApiCloudField(value="enable_card_fold_up")
    private Boolean enableCardFoldUp;
    @ApiCloudField(value="no_entry_by_hand")
    private Boolean noEntryByHand;
    @ApiCloudField(value="ticket_used_self")
    private Boolean ticketUsedSelf;
    @ApiCloudField(value="ticket_daily_limit")
    private Integer ticketDailyLimit;
    @ApiCloudField(value="ticket_point_value")
    private BigDecimal ticketPointValue;
    @ApiCloudField(value="ticket_default_valid_day")
    private Integer ticketDefaultValidDay;
    @ApiCloudField(value="ticket_start_valid_days")
    private Integer ticketStartValidDays;
    @ApiCloudField(value="category_codes")
    private List<String> categoryCodes;
    @ApiCloudField(value="except_category_codes")
    private List<String> exceptCategoryCodes;
    @ApiCloudField(value="item_nums")
    private List<Integer> itemNums;
    @ApiCloudField(value="item_config_dtos")
    private List<ItemCouponConfigDTOModel> itemConfigDtos;
    @ApiCloudField(value="item_grade_nums")
    private List<Integer> itemGradeNums;
    @ApiCloudField(value="item_grade_config_dtos")
    private List<ItemCouponConfigDTOModel> itemGradeConfigDtos;
    @ApiCloudField(value="discount_type")
    private Integer discountType;
    @ApiCloudField(value="doorsill_all_item")
    private Boolean doorsillAllItem;
    @ApiCloudField(value="doorsill_category_codes")
    private List<String> doorsillCategoryCodes;
    @ApiCloudField(value="doorsill_except_category_codes")
    private List<String> doorsillExceptCategoryCodes;
    @ApiCloudField(value="doorsill_item_nums")
    private List<Integer> doorsillItemNums;
    @ApiCloudField(value="doorsill_item_grade_nums")
    private List<Integer> doorsillItemGradeNums;
}
