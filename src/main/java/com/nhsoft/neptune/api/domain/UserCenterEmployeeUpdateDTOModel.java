package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterEmployeeUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterEmployeeUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="code", example="A0001", required=true)
    private String code;
    @ApiCloudField(value="name", example="A0001", required=true)
    private String name;
    @ApiCloudField(value="category_id", example="996750001", required=true)
    private Long categoryId;
    @ApiCloudField(value="branch_id", example="996750001", required=true)
    private Long branchId;
    @ApiCloudField(value="branch_ids", example="[996750001,996750002]")
    private List<Long> branchIds;
    @ApiCloudField(value="enable", example="true")
    private Boolean enable;
    @ApiCloudField(value="id_number", example="110101199001011234")
    private String idNumber;
    @ApiCloudField(value="permanent_code_url", example="https://www.baidu.com")
    private String permanentCodeUrl;
    @ApiCloudField(value="phone", example="110101199001011234")
    private String phone;
    @ApiCloudField(value="remark", example="员工备注")
    private String remark;
    @ApiCloudField(value="id", example="996750001", required=true)
    private Long id;
}
