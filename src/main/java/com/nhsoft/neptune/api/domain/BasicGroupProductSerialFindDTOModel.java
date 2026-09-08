package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicGroupProductSerialFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicGroupProductSerialFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="group_id")
    private Long groupId;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="10", required=true)
    private Integer pageSize;
}
