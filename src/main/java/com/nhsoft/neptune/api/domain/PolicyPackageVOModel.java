package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageVOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_no", example="99658990000058")
    private String policyPackageNo;
    @ApiCloudField(value="policy_package_name", example="测试活动")
    private String policyPackageName;
    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="policy_package_applied_branch", example="[1]")
    private List<Integer> policyPackageAppliedBranch;
    @ApiCloudField(value="policy_package_create_time", example="2021-01-01 00:00:00")
    private String policyPackageCreateTime;
    @ApiCloudField(value="policy_package_creator", example="管理员")
    private String policyPackageCreator;
    @ApiCloudField(value="policy_package_last_edit_time", example="2021-01-01 00:00:00")
    private String policyPackageLastEditTime;
    @ApiCloudField(value="policy_package_last_editor", example="管理员")
    private String policyPackageLastEditor;
    @ApiCloudField(value="policy_package_audit_time", example="2021-01-01 00:00:00")
    private String policyPackageAuditTime;
    @ApiCloudField(value="policy_package_auditor", example="管理员")
    private String policyPackageAuditor;
    @ApiCloudField(value="policy_package_cancel_time", example="2021-01-01 00:00:00")
    private String policyPackageCancelTime;
    @ApiCloudField(value="policy_package_cancel_operator", example="管理员")
    private String policyPackageCancelOperator;
    @ApiCloudField(value="state_code", example="1")
    private Integer stateCode;
    @ApiCloudField(value="state_name", example="制单")
    private String stateName;
    @ApiCloudField(value="policy_package_memo", example="备注信息")
    private String policyPackageMemo;
    @ApiCloudField(value="policy_package_date_from", example="2021-01-01")
    private String policyPackageDateFrom;
    @ApiCloudField(value="policy_package_date_to", example="2021-01-01")
    private String policyPackageDateTo;
    @ApiCloudField(value="policy_package_time_from")
    private String policyPackageTimeFrom;
    @ApiCloudField(value="policy_package_time_to")
    private String policyPackageTimeTo;
    @ApiCloudField(value="policy_package_card_only", example="true")
    private Boolean policyPackageCardOnly;
    @ApiCloudField(value="policy_package_card_type", example="[12331]")
    private List<String> policyPackageCardType;
    @ApiCloudField(value="policy_package_mon_actived", example="true")
    private Boolean policyPackageMonActived;
    @ApiCloudField(value="policy_package_tues_actived", example="true")
    private Boolean policyPackageTuesActived;
    @ApiCloudField(value="policy_package_wed_actived", example="true")
    private Boolean policyPackageWedActived;
    @ApiCloudField(value="policy_package_thurs_actived")
    private Boolean policyPackageThursActived;
    @ApiCloudField(value="policy_package_friday_actived", example="true")
    private Boolean policyPackageFridayActived;
    @ApiCloudField(value="policy_package_sat_actived", example="true")
    private Boolean policyPackageSatActived;
    @ApiCloudField(value="policy_package_sun_actived", example="true")
    private Boolean policyPackageSunActived;
    @ApiCloudField(value="policy_package_type", example="PACKAGE_ONE_PRICE")
    private String policyPackageType;
    @ApiCloudField(value="policy_package_level_ids", example="[9965800000002]")
    private List<Long> policyPackageLevelIds;
    @ApiCloudField(value="policy_schedule_ids", example="[1]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="except_branch", example="false")
    private Boolean exceptBranch;
    @ApiCloudField(value="policy_package_exception_day", example="[31]")
    private List<Integer> policyPackageExceptionDay;
    @ApiCloudField(value="policy_package_payment_money", example="100.0")
    private BigDecimal policyPackagePaymentMoney;
    @ApiCloudField(value="policy_package_choose_amount", example="2.0")
    private BigDecimal policyPackageChooseAmount;
    @ApiCloudField(value="policy_package_append", example="false")
    private Boolean policyPackageAppend;
    @ApiCloudField(value="policy_package_assigned_type", example="ITEM", required=true)
    private String policyPackageAssignedType;
    @ApiCloudField(value="policy_package_assigned_category")
    private List<String> policyPackageAssignedCategory;
    @ApiCloudField(value="policy_package_assigned_item_brand")
    private List<String> policyPackageAssignedItemBrand;
    @ApiCloudField(value="policy_package_except_item")
    private List<PosVariantNumModel> policyPackageExceptItem;
    @ApiCloudField(value="policy_package_details")
    private List<PolicyPackageDetailVOModel> policyPackageDetails;
    @ApiCloudField(value="policy_package_ladders")
    private List<PolicyPackageLadderVOModel> policyPackageLadders;
}
