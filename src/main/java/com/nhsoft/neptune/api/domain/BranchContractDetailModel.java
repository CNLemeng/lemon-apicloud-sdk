package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchContractDetail模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchContractDetailModel extends ApiCloudObject {

    @ApiCloudField(value="contract_detail_num")
    private Integer contractDetailNum;
    @ApiCloudField(value="contract_time_from", example="2026-09-20 04:00:00")
    private String contractTimeFrom;
    @ApiCloudField(value="contract_time_to", example="2026-09-20 23:00:00")
    private String contractTimeTo;
    @ApiCloudField(value="contract_type", example="111110")
    private String contractType;
    @ApiCloudField(value="contract_percent", example="0.1")
    private BigDecimal contractPercent;
    @ApiCloudField(value="contract_money", example="2.0")
    private BigDecimal contractMoney;
    @ApiCloudField(value="contract_start_money", example="1.0")
    private BigDecimal contractStartMoney;
    @ApiCloudField(value="other_inout_name")
    private String otherInoutName;
    @ApiCloudField(value="other_inout_type")
    private String otherInoutType;
}
