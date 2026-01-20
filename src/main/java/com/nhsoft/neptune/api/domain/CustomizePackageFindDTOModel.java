package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字", example="测试")
    private String keywords;
    @ApiCloudField(value="应用门店", example="[1]")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="状态代码(1：制单，3：制单|审核，7：制单|审核|作废)")
    private Integer stateCode;
    @ApiCloudField(value="是否查询明细", example="true")
    private Boolean withDetail;
    @ApiCloudField(value="最后更新时间(按照时间增量查询)", example="2025-03-26 11:36:00")
    private String lastEditTime;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小， 最大200", example="100", required=true)
    private Integer pageSize;
}
