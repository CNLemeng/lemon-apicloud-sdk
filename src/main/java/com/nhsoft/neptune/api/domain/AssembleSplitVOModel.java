package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AssembleSplitVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AssembleSplitVOModel extends ApiCloudObject {

    @ApiCloudField(value="组合拆分单号")
    private String assembleSplitFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="商品档案")
    private Integer itemNum;
    @ApiCloudField(value="制单人")
    private String assembleSplitCreator;
    @ApiCloudField(value="审核人")
    private String assembleSplitAuditor;
    @ApiCloudField(value="制单时间", example="2025-01-09 14:58:05")
    private String assembleSplitCreateTime;
    @ApiCloudField(value="审核时间", example="2025-01-09 14:58:05")
    private String assembleSplitAuditTime;
    @ApiCloudField(value="操作时间")
    private String assembleSplitDate;
    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
    @ApiCloudField(value="方式(组合|拆分)")
    private String assembleSplitType;
    @ApiCloudField(value="常用数量")
    private BigDecimal assembleSplitUseAmount;
    @ApiCloudField(value="常用单位")
    private String assembleSplitUseUnit;
    @ApiCloudField(value="数量")
    private BigDecimal assembleSplitAmount;
    @ApiCloudField(value="辅助数量")
    private BigDecimal assembleSplitAssistAmount;
    @ApiCloudField(value="单价")
    private BigDecimal assembleSplitPrice;
    @ApiCloudField(value="批次号")
    private String assembleSplitLotNumber;
    @ApiCloudField(value="备注")
    private String assembleSplitMemo;
    @ApiCloudField(value="生产日期")
    private String assembleSplitProducingDate;
    @ApiCloudField(value="状态码(1-制单；3-制单|审核)", example="1")
    private String assembleSplitStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String assembleSplitStateName;
    @ApiCloudField(value="明细")
    private List<AssembleSplitSaveDetailDTOModel> assembleSplitDetails;
}
