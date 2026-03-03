package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerLabelFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerLabelFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="group_id", example="9965800000001")
    private Long groupId;
    @ApiCloudField(value="query_all", example="true")
    private Boolean queryAll;
    @ApiCloudField(value="type", example="MANUAL")
    private String type;
    @ApiCloudField(value="display_in_offline", example="true")
    private Boolean displayInOffline;
}
