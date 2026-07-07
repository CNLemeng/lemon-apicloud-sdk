package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterOrganizationVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterOrganizationVOModel extends ApiCloudObject {

    @ApiCloudField(value="组织ID", example="1")
    private Long id;
    @ApiCloudField(value="组织编码", example="ORG001")
    private String code;
    @ApiCloudField(value="组织名称", example="销售部")
    private String name;
    @ApiCloudField(value="父级组织ID", example="0")
    private Long parentId;
    @ApiCloudField(value="负责人公司用户ID", example="10001")
    private Long managerId;
    @ApiCloudField(value="创建时间", example="2026-06-25 16:00:00")
    private String createdAt;
    @ApiCloudField(value="更新时间", example="2026-06-25 16:00:00")
    private String updatedAt;
    @ApiCloudField(value="直属用户数量", example="10")
    private Long userCount;
    @ApiCloudField(value="manager")
    private UserBasicUserVOModel manager;
}
