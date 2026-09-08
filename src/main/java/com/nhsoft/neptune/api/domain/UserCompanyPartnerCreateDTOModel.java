package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCompanyPartnerCreateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCompanyPartnerCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="app_type")
    private String appType;
    @ApiCloudField(value="app_types")
    private List<String> appTypes;
    @ApiCloudField(value="code")
    private String code;
    @ApiCloudField(value="company_user_password")
    private String companyUserPassword;
    @ApiCloudField(value="display_name")
    private String displayName;
    @ApiCloudField(value="enable", example="true")
    private Boolean enable;
    @ApiCloudField(value="expire_date", example="2026-10-01 00:00:00")
    private String expireDate;
    @ApiCloudField(value="name", example="admin", required=true)
    private String name;
    @ApiCloudField(value="open_app_ids")
    private List<String> openAppIds;
    @ApiCloudField(value="partner_id", example="1316616", required=true)
    private Long partnerId;
    @ApiCloudField(value="partner_type", example="SUPPLIER", required=true)
    private String partnerType;
    @ApiCloudField(value="password")
    private String password;
    @ApiCloudField(value="phone", required=true)
    private String phone;
    @ApiCloudField(value="roles")
    private List<Long> roles;
    @ApiCloudField(value="user_code")
    private String userCode;
    @ApiCloudField(value="whs_client_list")
    private List<Long> whsClientList;
}
