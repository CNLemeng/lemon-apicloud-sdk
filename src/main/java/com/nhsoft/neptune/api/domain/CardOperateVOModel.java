package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOperateVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOperateVOModel extends ApiCloudObject {

    @ApiCloudField(value="操作类型", example="")
    private String type;
    @ApiCloudField(value="操作时间")
    private String date;
    @ApiCloudField(value="操作人", example="")
    private String operator;
    @ApiCloudField(value="会员id")
    private Long customerId;
    @ApiCloudField(value="会员姓名", example="")
    private String customerName;
    @ApiCloudField(value="会员手机号", example="")
    private String customerPhone;
    @ApiCloudField(value="表面卡号", example="")
    private String printedNum;
    @ApiCloudField(value="备注", example="")
    private String memo;
    @ApiCloudField(value="卡类型名", example="")
    private String cardTypeName;
    @ApiCloudField(value="卡类型代码", example="")
    private String cardTypeCode;
    @ApiCloudField(value="操作门店", example="")
    private String branchName;
    @ApiCloudField(value="门店ID")
    private Integer branchId;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="营业日", example="")
    private String shiftTableBizday;
    @ApiCloudField(value="终端", example="")
    private String machineName;
    @ApiCloudField(value="推卡人", example="")
    private String seller;
    @ApiCloudField(value="购卡费用")
    private BigDecimal buyCardFee;
    @ApiCloudField(value="新表面卡号", example="")
    private String newPrintedNum;
    @ApiCloudField(value="新卡有效期")
    private String replaceCardNewDeadline;
    @ApiCloudField(value="老卡有效期")
    private String replaceCardOldDeadline;
    @ApiCloudField(value="换卡金额")
    private BigDecimal replaceCardMoney;
    @ApiCloudField(value="换卡付款方式", example="")
    private String replaceCardPaymentTypeName;
    @ApiCloudField(value="储值付款前余额")
    private BigDecimal depositBalance;
    @ApiCloudField(value="储值付款金额")
    private BigDecimal depositCash;
    @ApiCloudField(value="收款金额")
    private BigDecimal paymentAmount;
    @ApiCloudField(value="买家实付")
    private BigDecimal buyerPayMoney;
    @ApiCloudField(value="商家实收")
    private BigDecimal merchantGetMoney;
    @ApiCloudField(value="储值存款金额")
    private BigDecimal depositMoney;
    @ApiCloudField(value="储值存款后金额")
    private BigDecimal afterDepositMoney;
    @ApiCloudField(value="储值赠金储值")
    private BigDecimal depositPresentMoney;
    @ApiCloudField(value="储值存款积分")
    private BigDecimal depositPoint;
    @ApiCloudField(value="储值发票金额")
    private BigDecimal depositInvoice;
    @ApiCloudField(value="储值收款方式")
    private Integer depositPaymentType;
    @ApiCloudField(value="储值收款方式名称", example="")
    private String depositPaymentTypeName;
    @ApiCloudField(value="储值储值流水号", example="")
    private String depositFid;
    @ApiCloudField(value="储值存款渠道流水号", example="")
    private String depositChannelNo;
    @ApiCloudField(value="支付记录单据号", example="")
    private String depositPayNo;
    @ApiCloudField(value="储值存款渠道", example="")
    private String depositChannel;
    @ApiCloudField(value="储值时操作手机号", example="")
    private String depositOperatePhone;
    @ApiCloudField(value="客户", example="")
    private String posClientName;
    @ApiCloudField(value="参考单据号", example="")
    private String depositBillref;
    @ApiCloudField(value="可售后金额")
    private BigDecimal depositRefundableMoney;
    @ApiCloudField(value="储值卡编号(仅储值记录返回)")
    private Integer cardUserNum;
    @ApiCloudField(value="储值券来源名称", example="")
    private String couponSourceName;
    @ApiCloudField(value="平台优惠金额")
    private BigDecimal platformSubsidyMoney;
    @ApiCloudField(value="第三方交易流水号", example="")
    private String depositThirdPartyNo;
    @ApiCloudField(value="消费付款前余额")
    private BigDecimal consumeBalance;
    @ApiCloudField(value="消费金额")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="消费后金额")
    private BigDecimal afterConsumeMoney;
    @ApiCloudField(value="消费赠金储值")
    private BigDecimal consumePresentMoney;
    @ApiCloudField(value="消费发票金额")
    private BigDecimal consumeInvoice;
    @ApiCloudField(value="消费收款方式")
    private Integer consumePaymentType;
    @ApiCloudField(value="消费收款方式名称", example="")
    private String consumePaymentTypeName;
    @ApiCloudField(value="消费储值流水号", example="")
    private String consumeFid;
    @ApiCloudField(value="消费存款渠道流水号", example="")
    private String consumeChannelNo;
    @ApiCloudField(value="消费存款渠道", example="")
    private String consumeChannel;
    @ApiCloudField(value="消费单据号", example="")
    private String consumeBillNum;
    @ApiCloudField(value="消费订单号", example="")
    private String consumeOrderNo;
    @ApiCloudField(value="卡录入方式", example="")
    private String cardEntryMethod;
    @ApiCloudField(value="余额")
    private BigDecimal balance;
    @ApiCloudField(value="发卡门店", example="")
    private String enrollBranchName;
    @ApiCloudField(value="卡操作记录-卡回收金额")
    private BigDecimal revokeMoney;
    @ApiCloudField(value="卡操作记录-预储值金额")
    private BigDecimal preDepositMoney;
    @ApiCloudField(value="发卡门店编号（存款/消费时赋值）")
    private Integer enrollBranchNum;
    @ApiCloudField(value="发卡门店用户中心ID（存款/消费时赋值）")
    private Integer enrollBranch;
    @ApiCloudField(value="存款或消费的上传时间")
    private String depositOrConsumeSyncDate;
    @ApiCloudField(value="存款次数")
    private Integer depositCount;
}
