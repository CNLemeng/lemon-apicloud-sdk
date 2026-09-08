package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCompanyPartnerUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCompanyPartnerUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="app_type")
    private String appType;
    @ApiCloudField(value="app_types")
    private List<String> appTypes;
    @ApiCloudField(value="company_user_id", required=true)
    private Long companyUserId;
    @ApiCloudField(value="display_name")
    private String displayName;
    @ApiCloudField(value="enable")
    private Boolean enable;
    @ApiCloudField(value="expire_date", example="2026-10-01 00:00:00")
    private String expireDate;
    @ApiCloudField(value="fullname")
    private String fullname;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="open_app_ids")
    private List<String> openAppIds;
    @ApiCloudField(value="partner_id")
    private Long partnerId;
    @ApiCloudField(value="partner_type")
    private String partnerType;
    @ApiCloudField(value="password")
    private String password;
    @ApiCloudField(value="phone")
    private String phone;
    @ApiCloudField(value="roles")
    private List<Long> roles;
    @ApiCloudField(value="user_code")
    private String userCode;
    @ApiCloudField(value="whs_client_list")
    private List<Long> whsClientList;
    @ApiCloudField(value="user_new_phone")
    private String userNewPhone;
}
