package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MqttSystemSendDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MqttSystemSendDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="id", example="fe591cbf-a1f1-420f-b4bb-17a3c15cbd15", required=true)
    private String id;
    @ApiCloudField(value="system", required=true)
    private String system;
    @ApiCloudField(value="data", required=true)
    private Object data;
    @ApiCloudField(value="不传则由零售系统生成", example="2026-01-01 00:00:00")
    private String sendTime;
}
