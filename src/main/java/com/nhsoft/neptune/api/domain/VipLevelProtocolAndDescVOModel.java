package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VipLevelProtocolAndDescVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipLevelProtocolAndDescVOModel extends ApiCloudObject {

    @ApiCloudField(value="custom_protocol")
    private String customProtocol;
    @ApiCloudField(value="custom_protocol_version")
    private String customProtocolVersion;
    @ApiCloudField(value="custom_description")
    private String customDescription;
}
