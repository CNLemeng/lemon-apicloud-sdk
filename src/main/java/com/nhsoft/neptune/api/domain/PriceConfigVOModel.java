package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceConfigVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceConfigVOModel extends ApiCloudObject {

    @ApiCloudField(value="card_type")
    private Integer cardType;
    @ApiCloudField(value="online_kind")
    private String onlineKind;
    @ApiCloudField(value="offline_kind")
    private String offlineKind;
}
