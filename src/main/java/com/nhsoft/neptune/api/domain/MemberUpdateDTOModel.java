package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberUpdateDTO模型
 * 会员保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", example="9967500001", required=true)
    private Long customerId;
    @ApiCloudField(value="会员名称", example="admin", required=true)
    private String name;
    @ApiCloudField(value="出生日期", example="1978-12-06")
    private String birthday;
    @ApiCloudField(value="性别(1-未知,2-男,3-女)", example="1")
    private Integer gender;
}
