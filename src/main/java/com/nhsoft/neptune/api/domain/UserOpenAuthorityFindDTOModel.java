package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserOpenAuthorityFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserOpenAuthorityFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开放应用 ID", example="1e1a2f69c13440f0a8a724e7df6ede7c", required=true)
    private String openAppId;
}
