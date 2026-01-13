package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsReplenishmentOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsReplenishmentOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发货补单编号", example="RSO0010990000000006", required=true)
    private String replenishmentOrderId;
}
