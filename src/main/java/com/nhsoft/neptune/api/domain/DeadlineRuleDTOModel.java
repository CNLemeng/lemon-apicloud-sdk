package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DeadlineRuleDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeadlineRuleDTOModel extends ApiCloudObject {

    @ApiCloudField(value="after_deadline_required_advance_time_unit", example="MINUTES")
    private String afterDeadlineRequiredAdvanceTimeUnit;
    @ApiCloudField(value="before_deadline_required_advance_time_unit", example="MINUTES")
    private String beforeDeadlineRequiredAdvanceTimeUnit;
    @ApiCloudField(value="before_deadline_required_advance_time", example="10")
    private Long beforeDeadlineRequiredAdvanceTime;
    @ApiCloudField(value="after_deadline_required_advance_time", example="10")
    private Long afterDeadlineRequiredAdvanceTime;
    @ApiCloudField(value="deadline_time")
    private String deadlineTime;
    @ApiCloudField(value="day_of_week", example="[1,2]")
    private List<Integer> dayOfWeek;
}
