package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemFlagSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemFlagSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_nums", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="指定类别代码列表", example="[6666669]")
    private List<String> categoryCodes;
    @ApiCloudField(value="查询模板范围(指定商品|指定类别)", example="指定商品", required=true)
    private String itemFlagScope;
    @ApiCloudField(value="item_flag_name", example="测试", required=true)
    private String itemFlagName;
    @ApiCloudField(value="item_flag_type", example="查询模板", required=true)
    private String itemFlagType;
    @ApiCloudField(value="item_nums", example="[1]")
    private List<Integer> itemNums;
}
