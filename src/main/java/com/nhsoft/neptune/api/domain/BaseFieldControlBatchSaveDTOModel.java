package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseFieldControlBatchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseFieldControlBatchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="fields")
    private List<BaseFieldControlFieldDTOModel> fields;
    @ApiCloudField(value="module_code")
    private String moduleCode;
}
