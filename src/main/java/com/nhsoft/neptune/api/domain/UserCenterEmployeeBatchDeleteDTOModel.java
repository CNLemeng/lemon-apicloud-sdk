package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterEmployeeBatchDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterEmployeeBatchDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="ids", example="[1,2,3]")
    private List<Long> ids;
}
