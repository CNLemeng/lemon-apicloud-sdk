package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserOpenAuthorityRoleSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserOpenAuthorityRoleSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开放应用ID", example="376d585f437e4696b32144b81ae83b99", required=true)
    private String openAppId;
    @ApiCloudField(value="权限ID", example="9212089", required=true)
    private List<Long> authorityIds;
    @ApiCloudField(value="角色ID", example="1", required=true)
    private List<Long> roleIds;
}
