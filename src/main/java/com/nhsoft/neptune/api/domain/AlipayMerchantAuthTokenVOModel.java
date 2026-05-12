package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AlipayMerchantAuthTokenVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AlipayMerchantAuthTokenVOModel extends ApiCloudObject {

    @ApiCloudField(value="商户授权token")
    private String token;
}
