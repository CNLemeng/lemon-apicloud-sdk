package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RefundLogDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RefundLogDTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付流水号", example="564306837")
    private String payId;
    @ApiCloudField(value="退款流水号", example="564306837")
    private String refundId;
    @ApiCloudField(value="退款单据号", example="207299220801140002A")
    private String refundNo;
    @ApiCloudField(value="退款状态(0:成功；2：失败)", example="0")
    private Integer refundState;
    @ApiCloudField(value="用户ID，openId", example="ooIeqs-cMUK-tEjJWl1s-EnS16oA")
    private String buyerUserId;
    @ApiCloudField(value="操作员", example="管理员")
    private String operator;
    @ApiCloudField(value="退款开始时间", example="2022-03-21 09:40:25")
    private String refundStart;
    @ApiCloudField(value="退款结束时间", example="2022-03-21 09:40:32")
    private String refundEnd;
    @ApiCloudField(value="买家支付金额，单位分", example="100")
    private BigDecimal buyerPayAmount;
    @ApiCloudField(value="退款手续费，单位分", example="0")
    private BigDecimal refundFee;
    @ApiCloudField(value="渠道名称", example="0")
    private String channelName;
    @ApiCloudField(value="退款金额，单位分", example="0")
    private BigDecimal refundAmount;
    @ApiCloudField(value="第三方流水号", example="0")
    private String transactionNo;
    @ApiCloudField(value="pay_log")
    private PayLogDTOModel payLog;
}
