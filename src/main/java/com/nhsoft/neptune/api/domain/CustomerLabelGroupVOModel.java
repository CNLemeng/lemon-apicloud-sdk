package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerLabelGroupVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerLabelGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="会员标签分组编号", example="996580000001")
    private Long id;
    @ApiCloudField(value="会员标签分组名称", example="测试分组")
    private String name;
}
