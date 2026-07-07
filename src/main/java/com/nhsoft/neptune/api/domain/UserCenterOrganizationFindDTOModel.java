package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterOrganizationFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterOrganizationFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字", example="销售")
    private String keyword;
    @ApiCloudField(value="负责人公司用户ID列表", example="[10001,10002]")
    private List<Long> managerIds;
}
