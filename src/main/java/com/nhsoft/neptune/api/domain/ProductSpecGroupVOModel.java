package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProductSpecGroupVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductSpecGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="选项列表", example="")
    private List<String> group;
    @ApiCloudField(value="选项组名", example="")
    private String name;
}
