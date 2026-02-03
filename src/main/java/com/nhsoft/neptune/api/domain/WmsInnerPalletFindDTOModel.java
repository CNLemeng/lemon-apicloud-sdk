package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsInnerPalletFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsInnerPalletFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="大仓门店编号", example="99", required=true)
    private Integer dcBranchNum;
    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="托盘码", example="RQ998722601290001", required=true)
    private String palletNumber;
    @ApiCloudField(value="仓库编号", example="996580001", required=true)
    private Integer storehouseNum;
}
