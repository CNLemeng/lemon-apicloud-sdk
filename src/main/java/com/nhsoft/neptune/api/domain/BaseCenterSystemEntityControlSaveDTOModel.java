package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseCenterSystemEntityControlSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseCenterSystemEntityControlSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="biz_nums", example="[996750000001]", required=true)
    private List<String> bizNums;
    @ApiCloudField(value="module_code", example="SUPPLIER", required=true)
    private String moduleCode;
    @ApiCloudField(value="controlled_flag", example="true", required=true)
    private Boolean controlledFlag;
}
