package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderWmsSaveAndAuditStateVO模型
 * WMS批发单据状态
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderWmsSaveAndAuditStateVOModel extends ApiCloudObject {

    @ApiCloudField(value="状态代码")
    private Integer stateCode;
    @ApiCloudField(value="状态名称")
    private String stateName;
    @ApiCloudField(value="状态名称翻译")
    private String stateNameTranslate;
}
