package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleClientLabelSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleClientLabelSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户标签名称", example="标签B", required=true)
    private String name;
}
