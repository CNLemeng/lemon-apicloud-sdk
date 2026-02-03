package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowRevokeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowRevokeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="撤销用户编号(对应用户中心的company_user_id)", example="1", required=true)
    private Long revokerId;
    @ApiCloudField(value="审批记录编号", example="[SP99658202601270000025]", required=true)
    private List<String> instanceIdList;
    @ApiCloudField(value="撤销原因")
    private String message;
}
