package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutShareOrderSaveDetailDTO模型
 * 被分摊单据明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutShareOrderSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="5127", required=true)
    private Integer itemNum;
    @ApiCloudField(value="order_fid", example="AO202608270001", required=true)
    private String orderFid;
    @ApiCloudField(value="order_detail_num", example="1", required=true)
    private Integer orderDetailNum;
    @ApiCloudField(value="inventory_amount", example="10")
    private BigDecimal inventoryAmount;
    @ApiCloudField(value="inventory_cost", example="8.0")
    private BigDecimal inventoryCost;
    @ApiCloudField(value="detail_share_money", example="100.0", required=true)
    private BigDecimal detailShareMoney;
    @ApiCloudField(value="adjustment_inventory_cost", example="18.0")
    private BigDecimal adjustmentInventoryCost;
}
