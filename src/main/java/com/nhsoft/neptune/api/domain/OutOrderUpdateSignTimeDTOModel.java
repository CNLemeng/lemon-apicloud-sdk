package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderUpdateSignTimeDTO模型
 * 调出单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderUpdateSignTimeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", required=true)
    private String outOrderFid;
    @ApiCloudField(value="签收时间")
    private String signDate;
    @ApiCloudField(value="电子合同编号")
    private String contractNo;
}
