package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="1", required=true)
    private Long id;
}
