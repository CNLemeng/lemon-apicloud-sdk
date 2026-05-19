package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProductVariantBranchFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductVariantBranchFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_ids", example="[996750001]")
    private List<Long> branchIds;
    @ApiCloudField(value="group_ids", example="[1]")
    private List<Long> groupIds;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="product_ids", example="[1]")
    private List<Long> productIds;
    @ApiCloudField(value="variant_ids", example="[1]")
    private List<Long> variantIds;
}
