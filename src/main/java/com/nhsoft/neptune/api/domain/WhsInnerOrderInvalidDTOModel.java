package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsInnerOrderInvalidDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsInnerOrderInvalidDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", required=true)
    private String innerOrderFid;
    @ApiCloudField(value="备注")
    private String memo;
}
