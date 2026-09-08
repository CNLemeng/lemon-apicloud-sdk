package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosMachineFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosMachineFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_nums", example="[\"1\"]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="pos_machine_types", example="[\"QT\"]")
    private List<String> posMachineTypes;
    @ApiCloudField(value="keywords", example="POS11")
    private String keywords;
    @ApiCloudField(value="exclude_pos_machine_version")
    private String excludePosMachineVersion;
    @ApiCloudField(value="date_type", example="最后上传时间")
    private String dateType;
    @ApiCloudField(value="date_from", example="2026-01-01")
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-01-02")
    private String dateTo;
    @ApiCloudField(value="ai_no")
    private String aiNo;
    @ApiCloudField(value="pos_machine_enabled", example="true")
    private Boolean posMachineEnabled;
}
