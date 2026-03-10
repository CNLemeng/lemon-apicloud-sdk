package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerLabelUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerLabelUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="更新时填写")
    private Long labelId;
    @ApiCloudField(value="name", required=true)
    private String name;
}
