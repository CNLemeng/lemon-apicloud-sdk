package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosMachineEnableDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosMachineEnableDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="pos_machine_num", required=true)
    private Integer posMachineNum;
    @ApiCloudField(value="pos_machine_enabled", required=true)
    private Boolean posMachineEnabled;
}
