package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageGroupVO模型
 * 自选套餐分组
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="分组编号", example="1")
    private Integer groupNum;
    @ApiCloudField(value="分组名称", example="测试")
    private String groupName;
    @ApiCloudField(value="购买数量", example="1")
    private Integer purchaseQuantity;
    @ApiCloudField(value="分组明细")
    private List<CustomizePackageGroupDetailVOModel> groupDetails;
}
