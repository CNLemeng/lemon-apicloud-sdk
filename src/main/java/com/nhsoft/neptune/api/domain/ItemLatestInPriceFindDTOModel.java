package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemLatestInPriceFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemLatestInPriceFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="storehouse_num", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="item_num_list", required=true)
    private List<Integer> itemNumList;
}
