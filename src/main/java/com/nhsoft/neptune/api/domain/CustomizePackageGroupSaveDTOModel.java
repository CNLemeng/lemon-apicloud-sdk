package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageGroupSaveDTO模型
 * 自选套餐分组
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageGroupSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="分组名称", example="主食", required=true)
    private String groupName;
    @ApiCloudField(value="购买数量", example="1", required=true)
    private Integer purchaseQuantity;
    @ApiCloudField(value="分组明细", required=true)
    private List<CustomizePackageGroupDetailSaveDTOModel> groupDetails;
}
