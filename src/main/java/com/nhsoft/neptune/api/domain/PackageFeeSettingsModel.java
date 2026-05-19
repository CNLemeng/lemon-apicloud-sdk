package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PackageFeeSettings模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PackageFeeSettingsModel extends ApiCloudObject {

    @ApiCloudField(value="type", example="UNITY")
    private String type;
    @ApiCloudField(value="delivery_fee", example="0.0")
    private BigDecimal deliveryFee;
    @ApiCloudField(value="unity_fee", example="0.0")
    private BigDecimal unityFee;
    @ApiCloudField(value="self_pick_fee", example="0.0")
    private BigDecimal selfPickFee;
    @ApiCloudField(value="express_fee", example="0.0")
    private BigDecimal expressFee;
}
