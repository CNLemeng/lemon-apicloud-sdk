package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemMatrixV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemMatrixV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="扩展属性Name1(申请接口传入无效)")
    private String itemExtendName1;
    @ApiCloudField(value="扩展属性Name2(申请接口传入无效)")
    private String itemExtendName2;
    @ApiCloudField(value="扩展属性Name3(申请接口传入无效)")
    private String itemExtendName3;
    @ApiCloudField(value="扩展属性value1")
    private String itemExtend1;
    @ApiCloudField(value="扩展属性value2")
    private String itemExtend2;
    @ApiCloudField(value="扩展属性value3")
    private String itemExtend3;
}
