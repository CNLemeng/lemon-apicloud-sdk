package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientLabelRelationSaveDTO模型
 * 批发客户标签绑定关系
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientLabelRelationSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编码", example="1", required=true)
    private String clientFid;
    @ApiCloudField(value="客户标签ID列表", example="[1]", required=true)
    private List<Integer> labelIds;
}
