package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponVOModel extends ApiCloudObject {

    @ApiCloudField(value="券ID")
    private String id;
    @ApiCloudField(value="券活动明细id")
    private Long activityDetailId;
    @ApiCloudField(value="券码", example="98000020952311281488")
    private String barcode;
    @ApiCloudField(value="券核销全渠道会员编号(不记名券，该字段为空)", example="209500003401")
    private String customerId;
    @ApiCloudField(value="券核销会员手机号(不记名券，该字段为空)", example="178951202001")
    private String phone;
    @ApiCloudField(value="储值卡编号（同card_user_num）", example="1")
    private String cardId;
    @ApiCloudField(value="券面值", example="10.0")
    private BigDecimal value;
    @ApiCloudField(value="售价", example="1.1")
    private BigDecimal salePrice;
    @ApiCloudField(value="券可用开始时间")
    private String availStart;
    @ApiCloudField(value="券可用结束时间")
    private String availEnd;
    @ApiCloudField(value="券创建时间")
    private String createAt;
    @ApiCloudField(value="券更新时间")
    private String updateAt;
    @ApiCloudField(value="券核销时间")
    private String consumeAt;
    @ApiCloudField(value="券状态(CREATED:发券|CONSUMED:已核销|INVALID:已作废)", example="CONSUMED")
    private String state;
    @ApiCloudField(value="券创建渠道(AMA,CRM)", example="AMA")
    private String createChannel;
    @ApiCloudField(value="券创建门店编号(用户中心)", example="2531")
    private Integer createUserCenterBranchId;
    @ApiCloudField(value="券核销渠道(AMA,CRM)", example="AMA")
    private String consumeChannel;
    @ApiCloudField(value="券核销门店编号(用户中心)", example="2531")
    private Integer consumeUserCenterBranchId;
    @ApiCloudField(value="关联单号(线上订单|已结帐单)", example="WE55231101000062")
    private String relateOrderNo;
    @ApiCloudField(value="券核销门店编号(用户中心门店)")
    private Integer consumeBranchId;
    @ApiCloudField(value="发券门店编号(用户中心门店)")
    private Integer createBranchId;
    @ApiCloudField(value="实际抵扣金额")
    private BigDecimal money;
    @ApiCloudField(value="应用门店列表", example="[72708]")
    private List<Integer> branchNums;
    @ApiCloudField(value="例外门店列表", example="[111]")
    private List<Integer> exceptionBranchNums;
    @ApiCloudField(value="券状态(NOT_YET:未生效|IN_TIME：生效|EXPIRED：已过期)")
    private String validState;
}
