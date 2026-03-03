package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VipLevelProtocolAndDescReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipLevelProtocolAndDescReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="等级ID", example="9965800000219")
    private Long levelId;
    @ApiCloudField(value="等级rank")
    private Integer rank;
}
