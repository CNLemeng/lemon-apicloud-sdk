package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleReturnBatchIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleReturnBatchIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="wholesale_return_fids", example="[WR99675992606230001]", required=true)
    private List<String> wholesaleReturnFids;
}
