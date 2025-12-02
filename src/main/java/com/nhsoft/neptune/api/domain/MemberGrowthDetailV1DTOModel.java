package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberGrowthDetailV1DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberGrowthDetailV1DTOModel extends ApiCloudObject {

    @ApiCloudField(value="主键", example="207200321605")
    private String id;
    @ApiCloudField(value="成长值", example="10")
    private String value;
    @ApiCloudField(value="创建时间", example="2022-02-17 17:07:25")
    private String createdAt;
    @ApiCloudField(value="关联订单号", example="207201220483530007")
    private String refBillNo;
}
