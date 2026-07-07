package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterOrganizationUserFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterOrganizationUserFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="组织ID", example="1", required=true)
    private Long id;
    @ApiCloudField(value="关键字", example="张三")
    private String keyword;
    @ApiCloudField(value="页号", example="0", required=true)
    private Integer pageNo;
    @ApiCloudField(value="每页条数(最大200)", example="10", required=true)
    private Integer pageSize;
}
