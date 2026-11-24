package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsContainerFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsContainerFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="box_codes", example="[B179176872335893131117]")
    private List<String> boxCodes;
    @ApiCloudField(value="container_codes")
    private List<String> containerCodes;
    @ApiCloudField(value="erp_order_fid")
    private String erpOrderFid;
}
