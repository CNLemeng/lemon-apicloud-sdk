package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicUserReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicUserReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="公司用户ID", example="1", required=true)
    private Long companyUserId;
}
