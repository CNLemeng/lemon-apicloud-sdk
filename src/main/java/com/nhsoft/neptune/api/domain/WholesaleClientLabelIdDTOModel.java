package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleClientLabelIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleClientLabelIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户标签编号", example="1", required=true)
    private Integer id;
}
