package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AlipayAppTokenReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AlipayAppTokenReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="小程序appid", required=true)
    private String appid;
    @ApiCloudField(value="商户授权appid", required=true)
    private String componentId;
}
