package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterEmployeeCategoryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterEmployeeCategoryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="name", example="员工类别名称")
    private String name;
}
