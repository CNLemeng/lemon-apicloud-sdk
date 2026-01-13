package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientExtendBatchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientExtendBatchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="扩展属性列表", required=true)
    private List<PosClientExtendSaveDTOModel> posClientExtends;
}
