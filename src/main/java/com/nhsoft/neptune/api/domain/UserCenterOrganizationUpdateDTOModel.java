package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterOrganizationUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterOrganizationUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="组织ID，新增时为空，修改时必填", example="1", required=true)
    private Long id;
    @ApiCloudField(value="组织编码", example="ORG001")
    private String code;
    @ApiCloudField(value="组织名称", example="销售部")
    private String name;
    @ApiCloudField(value="父级组织ID", example="0")
    private Long parentId;
    @ApiCloudField(value="负责人公司用户ID", example="10001")
    private Long managerId;
}
