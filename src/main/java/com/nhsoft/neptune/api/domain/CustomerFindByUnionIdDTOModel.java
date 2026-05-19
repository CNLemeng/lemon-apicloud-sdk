package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerFindByUnionIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerFindByUnionIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="unionids", required=true)
    private List<String> unionids;
}
