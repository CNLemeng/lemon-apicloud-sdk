package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercurySaleOrderExpressUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercurySaleOrderExpressUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_id", required=true)
    private String orderId;
    @ApiCloudField(value="packages", required=true)
    private List<MercurySaleOrderExpressPackageDTOModel> packages;
}
