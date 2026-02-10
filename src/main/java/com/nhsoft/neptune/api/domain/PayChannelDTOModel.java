package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayChannelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayChannelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用id", example="917010000091372")
    private String appId;
    @ApiCloudField(value="渠道编号", example="1")
    private String channelId;
    @ApiCloudField(value="渠道名称", example="中国农业银行")
    private String channelName;
    @ApiCloudField(value="子商户")
    private List<PaySubChannelDTOModel> paySubChannels;
    @ApiCloudField(value="主商户设置")
    private Object paySettings;
}
