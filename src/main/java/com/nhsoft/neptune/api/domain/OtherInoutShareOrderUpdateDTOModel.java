package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutShareOrderUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutShareOrderUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="storehouse_num", example="1", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="operator", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="share_money", example="100.0", required=true)
    private BigDecimal shareMoney;
    @ApiCloudField(value="share_rule", example="按金额", required=true)
    private String shareRule;
    @ApiCloudField(value="share_order_type", example="库存转仓单", required=true)
    private String shareOrderType;
    @ApiCloudField(value="例如供应商费用单", example="供应商费用单", required=true)
    private String shareOrderInoutType;
    @ApiCloudField(value="memo", example="接口创建")
    private String memo;
    @ApiCloudField(value="other_inout_bill_nos", required=true)
    private List<String> otherInoutBillNos;
    @ApiCloudField(value="details", required=true)
    private List<OtherInoutShareOrderSaveDetailDTOModel> details;
    @ApiCloudField(value="不传表示新增，传入表示修改", example="OS992608270001", required=true)
    private String shareOrderFid;
}
