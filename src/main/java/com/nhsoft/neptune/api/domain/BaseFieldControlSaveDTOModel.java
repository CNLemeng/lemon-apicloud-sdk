package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseFieldControlSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseFieldControlSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="字段名称(对外标识)", required=true)
    private String name;
    @ApiCloudField(value="是否启用管控, 默认true", example="true", required=true)
    private Boolean controlFlag;
    @ApiCloudField(value="模块代码,可用值:ITEM,SUPPLIER,WHOLESALER", example="ITEM", required=true)
    private String moduleCode;
}
