package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GrowthRuleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GrowthRuleVOModel extends ApiCloudObject {

    @ApiCloudField(value="enable")
    private Boolean enable;
    @ApiCloudField(value="consume_rule")
    private Boolean consumeRule;
    @ApiCloudField(value="consume_online")
    private Boolean consumeOnline;
    @ApiCloudField(value="consume_offline")
    private Boolean consumeOffline;
    @ApiCloudField(value="consume_money")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="consume_extra_money")
    private BigDecimal consumeExtraMoney;
    @ApiCloudField(value="consume_extra_value")
    private Integer consumeExtraValue;
    @ApiCloudField(value="deposit_rule")
    private Boolean depositRule;
    @ApiCloudField(value="deposit_online")
    private Boolean depositOnline;
    @ApiCloudField(value="deposit_offline")
    private Boolean depositOffline;
    @ApiCloudField(value="deposit_cash")
    private BigDecimal depositCash;
    @ApiCloudField(value="deposit_extra_cash")
    private BigDecimal depositExtraCash;
    @ApiCloudField(value="deposit_extra_value")
    private Integer depositExtraValue;
    @ApiCloudField(value="custom_name")
    private String customName;
}
