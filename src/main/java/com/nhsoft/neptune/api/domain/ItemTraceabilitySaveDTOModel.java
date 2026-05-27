package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilitySaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilitySaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_traceability_id")
    private String itemTraceabilityId;
    @ApiCloudField(value="item_traceability_code", required=true)
    private String itemTraceabilityCode;
    @ApiCloudField(value="state_code", example="1")
    private Integer stateCode;
    @ApiCloudField(value="item_num", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="box_code_flag", example="true")
    private Boolean boxCodeFlag;
    @ApiCloudField(value="relation_box_code")
    private String relationBoxCode;
    @ApiCloudField(value="relation_factory_code")
    private String relationFactoryCode;
    @ApiCloudField(value="check_code")
    private String checkCode;
    @ApiCloudField(value="url")
    private String url;
    @ApiCloudField(value="creator")
    private String creator;
    @ApiCloudField(value="create_time")
    private String createTime;
    @ApiCloudField(value="canceler")
    private String canceler;
    @ApiCloudField(value="cancel_time")
    private String cancelTime;
    @ApiCloudField(value="pos_variant_num")
    private PosVariantNumModel posVariantNum;
}
