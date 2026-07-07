package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseFieldControlFieldDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseFieldControlFieldDTOModel extends ApiCloudObject {

    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="controlled_flag")
    private Boolean controlledFlag;
}
