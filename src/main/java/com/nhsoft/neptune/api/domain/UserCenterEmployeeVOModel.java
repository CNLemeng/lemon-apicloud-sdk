package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterEmployeeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterEmployeeVOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_id", example="996750001")
    private Long branchId;
    @ApiCloudField(value="branch_ids", example="[996750001,996750002]")
    private List<Long> branchIds;
    @ApiCloudField(value="company_user_id")
    private Long companyUserId;
    @ApiCloudField(value="category_id", example="996750001")
    private Long categoryId;
    @ApiCloudField(value="code", example="A0001")
    private String code;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="deleted", example="false")
    private Boolean deleted;
    @ApiCloudField(value="deleted_at", example="2026-01-01 00:00:00")
    private String deletedAt;
    @ApiCloudField(value="employee_num", example="1")
    private Long employeeNum;
    @ApiCloudField(value="enable", example="true")
    private Boolean enable;
    @ApiCloudField(value="h5_promotion_code_url", example="https://www.baidu.com")
    private String h5PromotionCodeUrl;
    @ApiCloudField(value="id", example="996750001")
    private Long id;
    @ApiCloudField(value="id_number", example="110101199001011234")
    private String idNumber;
    @ApiCloudField(value="mini_program_promotion_code_url", example="https://www.baidu.com")
    private String miniProgramPromotionCodeUrl;
    @ApiCloudField(value="name", example="A0001")
    private String name;
    @ApiCloudField(value="permanent_code_url", example="https://www.baidu.com")
    private String permanentCodeUrl;
    @ApiCloudField(value="phone", example="110101199001011234")
    private String phone;
    @ApiCloudField(value="remark", example="员工备注")
    private String remark;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="wechat_binded", example="false")
    private Boolean wechatBinded;
    @ApiCloudField(value="wechat_openid", example="oKj-_5t9XxYQy5_5x5x5x5x5x5x5x")
    private String wechatOpenid;
    @ApiCloudField(value="system_user", example="true")
    private Boolean systemUser;
}
