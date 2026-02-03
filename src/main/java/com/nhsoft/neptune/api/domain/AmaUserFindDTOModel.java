package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AmaUserFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AmaUserFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字查询", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="角色名称", example="收银员")
    private String roleName;
    @ApiCloudField(value="关键字查询", example="测试")
    private String keyword;
}
