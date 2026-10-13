package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_type", example="PACKAGE_ONE_PRICE", required=true)
    private String policyPackageType;
    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="except_branch", example="false")
    private Boolean exceptBranch;
    @ApiCloudField(value="policy_package_applied_branch", example="[1]")
    private List<Integer> policyPackageAppliedBranch;
    @ApiCloudField(value="policy_package_card_only", example="true")
    private Boolean policyPackageCardOnly;
    @ApiCloudField(value="policy_package_card_type", example="[11010]")
    private List<String> policyPackageCardType;
    @ApiCloudField(value="policy_package_level_ids", example="[9965800000002]")
    private List<Long> policyPackageLevelIds;
    @ApiCloudField(value="policy_package_date_from", example="2021-01-01", required=true)
    private String policyPackageDateFrom;
    @ApiCloudField(value="policy_package_date_to", example="2021-01-01", required=true)
    private String policyPackageDateTo;
    @ApiCloudField(value="policy_package_time_from", required=true)
    private String policyPackageTimeFrom;
    @ApiCloudField(value="policy_package_time_to", required=true)
    private String policyPackageTimeTo;
    @ApiCloudField(value="policy_package_mon_actived", example="true")
    private Boolean policyPackageMonActived;
    @ApiCloudField(value="policy_package_tues_actived", example="true")
    private Boolean policyPackageTuesActived;
    @ApiCloudField(value="policy_package_wed_actived", example="true")
    private Boolean policyPackageWedActived;
    @ApiCloudField(value="policy_package_thurs_actived", example="true")
    private Boolean policyPackageThursActived;
    @ApiCloudField(value="policy_package_friday_actived", example="true")
    private Boolean policyPackageFridayActived;
    @ApiCloudField(value="policy_package_sat_actived", example="true")
    private Boolean policyPackageSatActived;
    @ApiCloudField(value="policy_package_sun_actived", example="true")
    private Boolean policyPackageSunActived;
    @ApiCloudField(value="policy_package_memo", example="A")
    private String policyPackageMemo;
    @ApiCloudField(value="policy_package_name", example="测试活动名称")
    private String policyPackageName;
    @ApiCloudField(value="policy_package_exception_day", example="[1,2]")
    private List<Integer> policyPackageExceptionDay;
    @ApiCloudField(value="policy_package_payment_money", example="20.0")
    private BigDecimal policyPackagePaymentMoney;
    @ApiCloudField(value="policy_package_choose_amount", example="1.0")
    private BigDecimal policyPackageChooseAmount;
    @ApiCloudField(value="policy_schedule_ids", example="[1]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="policy_package_append", example="true")
    private Boolean policyPackageAppend;
    @ApiCloudField(value="policy_package_assigned_type", example="ITEM", required=true)
    private String policyPackageAssignedType;
    @ApiCloudField(value="policy_package_assigned_category", example="[0001]")
    private List<String> policyPackageAssignedCategory;
    @ApiCloudField(value="policy_package_assigned_item_brand", example="[可口可乐]")
    private List<String> policyPackageAssignedItemBrand;
    @ApiCloudField(value="policy_package_except_item")
    private List<PosVariantNumModel> policyPackageExceptItem;
    @ApiCloudField(value="policy_package_details")
    private List<PolicyPackageDetailSaveDTOModel> policyPackageDetails;
    @ApiCloudField(value="policy_package_ladders")
    private List<PolicyPackageLadderSaveDTOModel> policyPackageLadders;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
