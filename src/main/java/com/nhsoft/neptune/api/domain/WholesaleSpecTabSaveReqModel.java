package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleSpecTabSaveReq模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleSpecTabSaveReqModel extends ApiCloudObject {

    @ApiCloudField(value="spec_num", example="9967500001", required=true)
    private Long specNum;
    @ApiCloudField(value="float_rate_enable", example="true")
    private Boolean floatRateEnable;
    @ApiCloudField(value="independent_price_enable", example="true")
    private Boolean independentPriceEnable;
    @ApiCloudField(value="spec_multiple", example="1.0")
    private BigDecimal specMultiple;
    @ApiCloudField(value="spec_offset_qty", example="1.0")
    private BigDecimal specOffsetQty;
    @ApiCloudField(value="spec_upper_limit", example="2.0")
    private BigDecimal specUpperLimit;
    @ApiCloudField(value="wholesale_sale_enable", example="true")
    private Boolean wholesaleSaleEnable;
}
