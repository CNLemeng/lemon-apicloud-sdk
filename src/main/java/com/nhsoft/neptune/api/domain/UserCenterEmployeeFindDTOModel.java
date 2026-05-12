package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterEmployeeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterEmployeeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_id", example="996750001", required=true)
    private Long branchId;
}
