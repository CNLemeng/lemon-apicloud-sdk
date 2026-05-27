package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateBranchItemBatchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateBranchItemBatchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店要货模板详情", example="", required=true)
    private List<RequestTemplateDetailSaveDTOModel> templateDetails;
    @ApiCloudField(value="门店要货模板编号", example="434401000085", required=true)
    private Long templateNum;
}
