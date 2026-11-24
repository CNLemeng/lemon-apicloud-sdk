package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardTypeFindDTO模型
 * 次卡类型列表查询条件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardTypeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="次卡类型 ID 列表")
    private List<Long> ids;
    @ApiCloudField(value="名称，支持模糊查询")
    private String name;
    @ApiCloudField(value="是否启用")
    private Boolean enable;
    @ApiCloudField(value="可用渠道：ONLINE 为线上，OFFLINE 为线下")
    private String channel;
    @ApiCloudField(value="是否允许线上购买")
    private Boolean allowPurchase;
    @ApiCloudField(value="是否允许线下购买")
    private Boolean allowOfflinePurchase;
}
