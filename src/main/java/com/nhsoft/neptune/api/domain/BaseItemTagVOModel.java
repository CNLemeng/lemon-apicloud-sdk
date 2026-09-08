package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseItemTagVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseItemTagVOModel extends ApiCloudObject {

    @ApiCloudField(value="app_category_flag", example="true")
    private Boolean appCategoryFlag;
    @ApiCloudField(value="app_item_show_category_flag", example="true")
    private Boolean appItemShowCategoryFlag;
    @ApiCloudField(value="app_item_sort_by_serial_flag", example="true")
    private Boolean appItemSortBySerialFlag;
    @ApiCloudField(value="app_wholesale_item", example="true")
    private Boolean appWholesaleItem;
    @ApiCloudField(value="app_wholesale_order_category_flag", example="true")
    private Boolean appWholesaleOrderCategoryFlag;
    @ApiCloudField(value="branch_nums", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="branch_nums_rdc_flag", example="true")
    private Boolean branchNumsRdcFlag;
    @ApiCloudField(value="colour", example="#bd10e0")
    private String colour;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="created_by", example="525619")
    private Long createdBy;
    @ApiCloudField(value="deleted_flag", example="true")
    private Boolean deletedFlag;
    @ApiCloudField(value="id", example="9967500000460")
    private Long id;
    @ApiCloudField(value="memo", example="测试")
    private String memo;
    @ApiCloudField(value="pos_branch_nums", example="[1]")
    private List<Integer> posBranchNums;
    @ApiCloudField(value="pos_category_flag", example="true")
    private Boolean posCategoryFlag;
    @ApiCloudField(value="pos_subscript_flag", example="true")
    private Boolean posSubscriptFlag;
    @ApiCloudField(value="pos_subscript_text", example="最火")
    private String posSubscriptText;
    @ApiCloudField(value="query_purchase_app_item_label", example="true")
    private Boolean queryPurchaseAppItemLabel;
    @ApiCloudField(value="relation_item_count", example="10")
    private Integer relationItemCount;
    @ApiCloudField(value="serial_num", example="114")
    private String serialNum;
    @ApiCloudField(value="show_in_shopping_cart", example="true")
    private Boolean showInShoppingCart;
    @ApiCloudField(value="tag_name", example="测试标签")
    private String tagName;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="updated_by", example="525619")
    private Long updatedBy;
    @ApiCloudField(value="whs_wx_mini_app_show_colour")
    private String whsWxMiniAppShowColour;
    @ApiCloudField(value="whs_wx_mini_app_show_flag", example="true")
    private Boolean whsWxMiniAppShowFlag;
    @ApiCloudField(value="whs_wx_mini_app_tag_colour", example="#bd10e0")
    private String whsWxMiniAppTagColour;
}
