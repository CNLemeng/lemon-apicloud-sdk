package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageVOModel extends ApiCloudObject {

    @ApiCloudField(value="自选套餐编号", example="996750000013")
    private String customizePackageNo;
    @ApiCloudField(value="自选套餐名称", example="测试")
    private String customizePackageName;
    @ApiCloudField(value="制单门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表", example="[1,2]")
    private List<Integer> appliedBranchNums;
    @ApiCloudField(value="创建时间", example="2025-03-26 11:36:00")
    private String createTime;
    @ApiCloudField(value="创建人", example="admin")
    private String creator;
    @ApiCloudField(value="最后修改时间", example="2025-03-26 11:36:00")
    private String editTime;
    @ApiCloudField(value="最后修改人", example="admin")
    private String editor;
    @ApiCloudField(value="审核时间", example="2025-03-26 11:36:00")
    private String auditTime;
    @ApiCloudField(value="审核人", example="admin")
    private String auditor;
    @ApiCloudField(value="作废时间", example="2025-03-26 11:36:00")
    private String cancelTime;
    @ApiCloudField(value="作废人", example="admin")
    private String cancelOperator;
    @ApiCloudField(value="状态代码", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="备注", example="测试")
    private String remark;
    @ApiCloudField(value="开始日期（yyyy-MM-dd）", example="Wed Mar 26 08:00:00 CST 2025")
    private String dateFrom;
    @ApiCloudField(value="结束日期（yyyy-MM-dd）", example="Wed Mar 26 08:00:00 CST 2025")
    private String dateTo;
    @ApiCloudField(value="time_from")
    private LocalTimeModel timeFrom;
    @ApiCloudField(value="time_to")
    private LocalTimeModel timeTo;
    @ApiCloudField(value="星期一是否生效", example="true")
    private Boolean monActived;
    @ApiCloudField(value="星期二是否生效", example="true")
    private Boolean tueActived;
    @ApiCloudField(value="星期三是否生效", example="true")
    private Boolean wedActived;
    @ApiCloudField(value="星期四是否生效", example="true")
    private Boolean thuActived;
    @ApiCloudField(value="星期五是否生效", example="true")
    private Boolean friActived;
    @ApiCloudField(value="星期六是否生效", example="true")
    private Boolean satActived;
    @ApiCloudField(value="星期日是否生效", example="true")
    private Boolean sunActived;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="自选套餐分组")
    private List<CustomizePackageGroupVOModel> groups;
}
