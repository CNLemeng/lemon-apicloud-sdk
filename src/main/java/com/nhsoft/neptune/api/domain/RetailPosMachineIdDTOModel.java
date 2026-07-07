package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RetailPosMachineIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RetailPosMachineIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="pos_machine_num", example="706", required=true)
    private Integer posMachineNum;
}
