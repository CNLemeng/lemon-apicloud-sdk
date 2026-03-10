package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerLabelSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerLabelSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="name", required=true)
    private String name;
}
