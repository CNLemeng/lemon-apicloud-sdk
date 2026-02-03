package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderBatchUpdateSignTimeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderBatchUpdateSignTimeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单明细", required=true)
    private List<OutOrderUpdateSignTimeDTOModel> details;
}
