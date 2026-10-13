package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchContractIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchContractIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="contract_id", example="9965801000033", required=true)
    private Long contractId;
}
