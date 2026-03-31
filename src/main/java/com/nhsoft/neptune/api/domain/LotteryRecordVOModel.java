package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * LotteryRecordVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LotteryRecordVOModel extends ApiCloudObject {

    @ApiCloudField(value="抽奖ID", example="9965800002312")
    private Long id;
    @ApiCloudField(value="会员名称", example="张三")
    private String customerName;
    @ApiCloudField(value="会员ID", example="9965800000143")
    private Long customerId;
    @ApiCloudField(value="抽奖时间", example="2026-01-01 00:00:00")
    private String lotteryTime;
    @ApiCloudField(value="获取时间", example="2026-01-01 00:00:00")
    private String createTime;
    @ApiCloudField(value="获取来源(CROWD:人群运营|MEMBERDAY:会员日营销|BIRTH:生日营销|FESTIVAL:节日营销|REGISTER:注册有礼|DEPOSIT:储值有礼|MISSION:会员任务|COUPON:自助领券|UPGRADE:升级有礼|WELCOME:到店有礼|EMPLOYEE_REWARD:员工奖励|INVITED:邀请有礼|SIGN_IN:签到有礼|POS_CONSUMER_LOTTERY:pos消费赠抽奖次数|FREE_WITH_DEPOSIT:储值免单|POINT_TO_EXCHANGE:积分兑换|SHARE:分享|TASK:会员任务|COMMENT_REWARD:评价有礼|IMPORT:导入)", example="POS_CONSUMER_LOTTERY")
    private String actionType;
    @ApiCloudField(value="门店名称", example="管理中心")
    private String branchName;
    @ApiCloudField(value="门店编号", example="72708")
    private Long branchId;
    @ApiCloudField(value="抽奖状态(NONE:未中奖|LOTTERY:已中奖|CANCEL:作废)", example="LOTTERY")
    private String prizeDraw;
    @ApiCloudField(value="奖品名称")
    private String rewardName;
}
