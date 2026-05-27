package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterEmployeeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterEmployeeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_id", example="996750001")
    private Long branchId;
    @ApiCloudField(value="phone", example="13800000000")
    private String phone;
    @ApiCloudField(value="name", example="张三")
    private String name;
    @ApiCloudField(value="enable", example="true")
    private Boolean enable;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="200", required=true)
    private Integer pageSize;
}
