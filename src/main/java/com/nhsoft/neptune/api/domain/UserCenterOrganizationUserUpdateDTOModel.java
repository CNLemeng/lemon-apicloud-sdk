package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterOrganizationUserUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterOrganizationUserUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="组织ID", example="1", required=true)
    private Long id;
    @ApiCloudField(value="新增公司用户ID列表", example="[10001,10002]")
    private List<Long> addCompanyUserIds;
    @ApiCloudField(value="移除公司用户ID列表", example="[10003,10004]")
    private List<Long> removeCompanyUserIds;
}
