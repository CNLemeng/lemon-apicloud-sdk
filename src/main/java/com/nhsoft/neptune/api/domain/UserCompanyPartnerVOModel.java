package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCompanyPartnerVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCompanyPartnerVOModel extends ApiCloudObject {

    @ApiCloudField(value="company_user_id")
    private Long companyUserId;
    @ApiCloudField(value="user_id")
    private Long userId;
    @ApiCloudField(value="user_code")
    private String userCode;
    @ApiCloudField(value="partner_id")
    private Long partnerId;
    @ApiCloudField(value="partner")
    private UserCompanyPartnerInfoVOModel partner;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="display_name")
    private String displayName;
    @ApiCloudField(value="phone")
    private String phone;
    @ApiCloudField(value="enable")
    private Boolean enable;
    @ApiCloudField(value="simple_roles")
    private List<UserBasicRoleVOModel> simpleRoles;
    @ApiCloudField(value="whs_client_list")
    private List<Long> whsClientList;
    @ApiCloudField(value="expire_date", example="2026-08-03 00:00:00")
    private String expireDate;
    @ApiCloudField(value="created_at", example="2026-08-03 00:00:00")
    private String createdAt;
    @ApiCloudField(value="updated_at", example="2026-08-03 00:00:00")
    private String updatedAt;
}
