package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferProfitFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferProfitFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="dt_from")
    private String dtFrom;
    @ApiCloudField(value="dt_to")
    private String dtTo;
    @ApiCloudField(value="date_type")
    private String dateType;
    @ApiCloudField(value="branch_nums")
    private List<Integer> branchNums;
    @ApiCloudField(value="center_branch_nums")
    private List<Integer> centerBranchNums;
    @ApiCloudField(value="item_nums")
    private List<Integer> itemNums;
    @ApiCloudField(value="category_codes")
    private List<String> categoryCodes;
    @ApiCloudField(value="deep_index")
    private Integer deepIndex;
    @ApiCloudField(value="summary")
    private String summary;
    @ApiCloudField(value="ratio_type")
    private String ratioType;
}
