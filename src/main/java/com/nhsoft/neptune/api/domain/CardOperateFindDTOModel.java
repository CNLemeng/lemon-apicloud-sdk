package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOperateFindDTO模型
 * 储值卡操作记录查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOperateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始日期", example="2026-11-20 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2026-11-20 23:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="查询类型：CARD_SEND:发卡记录、CARD_CHANGE：换卡记录、CARD_DEPOSIT：存款记录、CARD_CONSUME：消费记录、CARD_LOSS：挂失记录、CARD_UNLOSS：解挂记录、CARD_OPERATE：卡操作记录、CARD_UPDATE：卡修改记录、CARD_LOCK：锁卡记录、CARD_UNLOCK：解锁记录、CARD_ID_ENCRYPT：ID卡加密", required=true)
    private String type;
    @ApiCloudField(value="用户中心操作门店ID列表")
    private List<Integer> branchIds;
    @ApiCloudField(value="线下门店编号列表")
    private List<Integer> branchNums;
    @ApiCloudField(value="表面卡号；ALL类型必填")
    private String cardPrintNum;
    @ApiCloudField(value="操作人")
    private String operator;
    @ApiCloudField(value="用户中心发卡门店ID列表")
    private List<Integer> cardBranchIds;
    @ApiCloudField(value="是否首存")
    private Boolean firstDeposit;
    @ApiCloudField(value="卡类型列表")
    private List<Integer> cardTypes;
    @ApiCloudField(value="操作渠道")
    private String operateChannel;
    @ApiCloudField(value="储值时操作手机号")
    private String depositOperatePhone;
    @ApiCloudField(value="参考单据号，仅存款记录有效")
    private String billref;
    @ApiCloudField(value="推卡人")
    private String seller;
    @ApiCloudField(value="挂失/解挂标记")
    private Boolean prizeCard;
    @ApiCloudField(value="备注")
    private String memo;
    @ApiCloudField(value="支付方式")
    private String paymentType;
    @ApiCloudField(value="支付方式多选，目前仅储值记录支持")
    private List<String> paymentTypes;
    @ApiCloudField(value="会员手机号")
    private String customerPhone;
    @ApiCloudField(value="会员名下卡ID或指定卡ID列表")
    private List<Long> cardUserNums;
    @ApiCloudField(value="操作类型，查卡操作记录时有效")
    private String logType;
    @ApiCloudField(value="消费类型")
    private String consumeType;
    @ApiCloudField(value="存款类型：存款、反存款")
    private String depositType;
    @ApiCloudField(value="客户名称，仅存款记录有效")
    private String posClientName;
    @ApiCloudField(value="客户FID列表，仅存款记录有效")
    private List<String> posClientFid;
    @ApiCloudField(value="存款记录ID")
    private String depositFid;
    @ApiCloudField(value="是否查询储值可售后金额")
    private Boolean queryDepositRefundableMoney;
    @ApiCloudField(value="资金结算：0待结算、1已生成应收单、2已结算")
    private Integer settlementState;
    @ApiCloudField(value="是否过滤平台优惠为0的记录")
    private Boolean filterZeroPlatformSubsidyMoney;
    @ApiCloudField(value="查询页码，从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="每页条数，最大100", example="100", required=true)
    private Integer pageSize;
}
