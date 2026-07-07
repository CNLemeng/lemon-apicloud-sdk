package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RetailPosMachineDelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RetailPosMachineDelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="pos_machine_ids", required=true)
    private List<RetailPosMachineIdDTOModel> posMachineIds;
}
