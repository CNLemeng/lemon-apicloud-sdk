package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientExtendSaveDTO模型
 * 扩展属性列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientExtendSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编号", example="0015005990000001", required=true)
    private String clientFid;
    @ApiCloudField(value="扩展属性id", example="9967500000011", required=true)
    private String propertyId;
    @ApiCloudField(value="扩展属性值", example="a", required=true)
    private String propertyValue;
}
