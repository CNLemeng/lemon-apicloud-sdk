package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientLabelRelationBatchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientLabelRelationBatchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发客户标签绑定关系", required=true)
    private List<ClientLabelRelationSaveDTOModel> relations;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
}
