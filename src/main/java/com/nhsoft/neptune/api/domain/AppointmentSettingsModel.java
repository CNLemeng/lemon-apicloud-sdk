package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppointmentSettings模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppointmentSettingsModel extends ApiCloudObject {

    @ApiCloudField(value="times")
    private List<BusinessTimeDTOModel> times;
    @ApiCloudField(value="interval_unit", example="秒")
    private String intervalUnit;
    @ApiCloudField(value="per_interval_max_appointment_amount", example="10")
    private Long perIntervalMaxAppointmentAmount;
    @ApiCloudField(value="deadline_rule_dto")
    private DeadlineRuleDTOModel deadlineRuleDto;
    @ApiCloudField(value="max_appointment_value", example="10")
    private Long maxAppointmentValue;
    @ApiCloudField(value="max_appointment_value_unit", example="MINUTES")
    private String maxAppointmentValueUnit;
    @ApiCloudField(value="group_ids", example="[10]")
    private List<Long> groupIds;
    @ApiCloudField(value="min_appointment_time", example="10")
    private Long minAppointmentTime;
    @ApiCloudField(value="min_appointment_time_unit", example="MINUTES")
    private String minAppointmentTimeUnit;
    @ApiCloudField(value="interval", example="1")
    private Long interval;
    @ApiCloudField(value="deadline_rule_weekly")
    private List<DeadlineRuleDTOModel> deadlineRuleWeekly;
    @ApiCloudField(value="deadline_rule_daily")
    private DeadlineRuleDTOModel deadlineRuleDaily;
}
