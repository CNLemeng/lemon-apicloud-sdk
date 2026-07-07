package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterOrganizationSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterOrganizationSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="组织编码", example="ORG001", required=true)
    private String code;
    @ApiCloudField(value="组织名称", example="销售部", required=true)
    private String name;
    @ApiCloudField(value="父级组织ID", example="0", required=true)
    private Long parentId;
    @ApiCloudField(value="负责人公司用户ID", example="10001")
    private Long managerId;
}
