package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="自选套餐编号，不传为新增，传入为修改", example="996750000013")
    private String customizePackageNo;
    @ApiCloudField(value="制单门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="自选套餐名称", example="自选午餐", required=true)
    private String customizePackageName;
    @ApiCloudField(value="备注")
    private String remark;
    @ApiCloudField(value="开始日期（yyyy-MM-dd）", example="2026-10-27", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期（yyyy-MM-dd）", example="2026-12-31", required=true)
    private String dateTo;
    @ApiCloudField(value="time_from", required=true)
    private String timeFrom;
    @ApiCloudField(value="time_to", required=true)
    private String timeTo;
    @ApiCloudField(value="应用门店/例外门店编码，空列表表示全部门店", example="[1,2]")
    private List<Integer> appliedBranchNums;
    @ApiCloudField(value="星期一是否生效", required=true)
    private Boolean monActived;
    @ApiCloudField(value="星期二是否生效", required=true)
    private Boolean tueActived;
    @ApiCloudField(value="星期三是否生效", required=true)
    private Boolean wedActived;
    @ApiCloudField(value="星期四是否生效", required=true)
    private Boolean thuActived;
    @ApiCloudField(value="星期五是否生效", required=true)
    private Boolean friActived;
    @ApiCloudField(value="星期六是否生效", required=true)
    private Boolean satActived;
    @ApiCloudField(value="星期日是否生效", required=true)
    private Boolean sunActived;
    @ApiCloudField(value="是否例外门店", required=true)
    private Boolean exceptBranch;
    @ApiCloudField(value="套餐类型：ITEM 按商品计价，PACKAGE 按套餐计价，默认 ITEM", example="ITEM", required=true)
    private String packageType;
    @ApiCloudField(value="套餐价，套餐类型为 PACKAGE 时必填", example="20.0")
    private BigDecimal packagePrice;
    @ApiCloudField(value="自选套餐分组", required=true)
    private List<CustomizePackageGroupSaveDTOModel> groups;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
}
