package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercurySaleOrderExpressPackageDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercurySaleOrderExpressPackageDTOModel extends ApiCloudObject {

    @ApiCloudField(value="detail_nums", example="[1]", required=true)
    private List<Integer> detailNums;
    @ApiCloudField(value="company_name", example="顺丰快递", required=true)
    private String companyName;
    @ApiCloudField(value="express_no", example="SF00000010", required=true)
    private String expressNo;
}
