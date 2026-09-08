package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCompanyPartnerFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCompanyPartnerFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="code")
    private String code;
    @ApiCloudField(value="company_user_id")
    private Long companyUserId;
    @ApiCloudField(value="enable")
    private Boolean enable;
    @ApiCloudField(value="keyword")
    private String keyword;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="partner_id_list")
    private List<Long> partnerIdList;
    @ApiCloudField(value="partner_type", example="SUPPLIER", required=true)
    private String partnerType;
    @ApiCloudField(value="whs_client_id_list")
    private List<Long> whsClientIdList;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="200", required=true)
    private Integer pageSize;
}
