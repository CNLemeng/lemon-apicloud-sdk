package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="经营范围编码")
    private Integer managementTemplateNum;
    @ApiCloudField(value="经营范围名称")
    private String managementTemplateName;
    @ApiCloudField(value="经营范围最后修改时间")
    private String managementTemplateLastEditTime;
    @ApiCloudField(value="经营范围明细")
    private List<ManagementTemplateDetailV2DTOModel> managementTemplateDetails;
}
