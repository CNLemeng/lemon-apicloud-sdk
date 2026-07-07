package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleSaleEnableDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleSaleEnableDTOModel extends ApiCloudObject {

    @ApiCloudField(value="company_user_id", example="524939", required=true)
    private Long companyUserId;
    @ApiCloudField(value="item_num", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="spec_num", example="9967500001", required=true)
    private Long specNum;
    @ApiCloudField(value="wholesale_sale_enable", example="true", required=true)
    private Boolean wholesaleSaleEnable;
}
