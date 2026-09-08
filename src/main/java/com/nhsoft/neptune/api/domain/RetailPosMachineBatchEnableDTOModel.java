package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RetailPosMachineBatchEnableDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RetailPosMachineBatchEnableDTOModel extends ApiCloudObject {

    @ApiCloudField(value="operator", required=true)
    private String operator;
    @ApiCloudField(value="pos_machine_enable_list", required=true)
    private List<PosMachineEnableDTOModel> posMachineEnableList;
}
