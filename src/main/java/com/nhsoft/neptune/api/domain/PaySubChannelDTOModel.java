package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PaySubChannelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PaySubChannelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="子渠道编号", example="1")
    private String subChannelId;
    @ApiCloudField(value="主渠道编号", example="1")
    private String channelId;
    @ApiCloudField(value="子商户号", example="1304")
    private String subAppId;
    @ApiCloudField(value="子渠道设置")
    private Object paySubSettings;
}
