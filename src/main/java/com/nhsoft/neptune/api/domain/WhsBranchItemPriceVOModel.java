package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsBranchItemPriceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsBranchItemPriceVOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="item_num", example="387")
    private Integer itemNum;
    @ApiCloudField(value="spec_num", example="9967900000875")
    private Long specNum;
    @ApiCloudField(value="branch_wholesale_price", example="20.0")
    private BigDecimal branchWholesalePrice;
    @ApiCloudField(value="spec_sell_enable", example="true")
    private Boolean specSellEnable;
    @ApiCloudField(value="spec_virtual_stock", example="20.0")
    private BigDecimal specVirtualStock;
    @ApiCloudField(value="last_edit_time")
    private String lastEditTime;
    @ApiCloudField(value="spec_branch_offset_qty", example="10.0")
    private BigDecimal specBranchOffsetQty;
    @ApiCloudField(value="spec_branch_multiple", example="5.0")
    private BigDecimal specBranchMultiple;
    @ApiCloudField(value="spec_branch_upper_limit", example="10.0")
    private BigDecimal specBranchUpperLimit;
}
