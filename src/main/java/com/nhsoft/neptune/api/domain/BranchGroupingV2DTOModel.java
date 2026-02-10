package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchGroupingV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchGroupingV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店分组编号")
    private String branchGroupingNum;
    @ApiCloudField(value="门店分组代码")
    private String branchGroupingCode;
    @ApiCloudField(value="门店分组名称")
    private String branchGroupingName;
    @ApiCloudField(value="门店分组备注")
    private String branchGroupingMemo;
    @ApiCloudField(value="门店分组明细")
    private List<BranchGroupingDetailV2DTOModel> branchGroupingDetails;
}
