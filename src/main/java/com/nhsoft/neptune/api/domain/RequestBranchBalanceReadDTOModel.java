package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBranchBalanceReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBranchBalanceReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="out_branch_num", example="99", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="exclude_request_money", example="true")
    private Boolean excludeRequestMoney;
}
