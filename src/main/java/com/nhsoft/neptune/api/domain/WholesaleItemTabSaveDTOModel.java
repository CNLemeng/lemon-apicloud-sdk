package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleItemTabSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleItemTabSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="company_user_id", example="996750001", required=true)
    private Long companyUserId;
    @ApiCloudField(value="item_num", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="specs", required=true)
    private List<WholesaleSpecTabSaveReqModel> specs;
}
