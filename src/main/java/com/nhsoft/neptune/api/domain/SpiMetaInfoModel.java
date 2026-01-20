package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SpiMetaInfo模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SpiMetaInfoModel extends ApiCloudObject {

    @ApiCloudField(value="merchant_id")
    private String merchantId;
    @ApiCloudField(value="spi_url")
    private String spiUrl;
    @ApiCloudField(value="spi_name")
    private String spiName;
    @ApiCloudField(value="timeout")
    private Long timeout;
}
