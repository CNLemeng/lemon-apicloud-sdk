package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemRecordProductDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemRecordProductDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="[1]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编号", example="9967500001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="单据类型", required=true)
    private String branchItemRecoredType;
}
