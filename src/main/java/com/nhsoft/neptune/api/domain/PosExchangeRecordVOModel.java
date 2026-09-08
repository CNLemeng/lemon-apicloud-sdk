package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosExchangeRecordVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosExchangeRecordVOModel extends ApiCloudObject {

    @ApiCloudField(value="record_fid")
    private String recordFid;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="shift_table_bizday")
    private String shiftTableBizday;
    @ApiCloudField(value="shift_table_num")
    private Integer shiftTableNum;
    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="item_regular_price")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="exchange_item_num")
    private Integer exchangeItemNum;
    @ApiCloudField(value="exchange_item_grade_num")
    private Integer exchangeItemGradeNum;
    @ApiCloudField(value="item_amount")
    private BigDecimal itemAmount;
    @ApiCloudField(value="exchange_amount")
    private BigDecimal exchangeAmount;
    @ApiCloudField(value="exchange_add_money")
    private BigDecimal exchangeAddMoney;
    @ApiCloudField(value="create_time")
    private String createTime;
    @ApiCloudField(value="record_operator")
    private String recordOperator;
}
