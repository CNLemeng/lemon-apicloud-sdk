package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayLogDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayLogDTOModel extends ApiCloudObject {

    @ApiCloudField(value="交易流水号", example="564306837")
    private String payId;
    @ApiCloudField(value="支付方式", example="微信条码支付")
    private String payType;
    @ApiCloudField(value="单据号", example="207299220801140002")
    private String orderNo;
    @ApiCloudField(value="单据类型", example="微信支付")
    private String orderType;
    @ApiCloudField(value="支付状态", example="0")
    private Integer payState;
    @ApiCloudField(value="撤销状态", example="-1")
    private Integer reverseState;
    @ApiCloudField(value="用户ID，openId", example="ooIeqs-cMUK-tEjJWl1s-EnS16oA")
    private String buyerUserId;
    @ApiCloudField(value="操作员", example="管理员")
    private String operator;
    @ApiCloudField(value="支付开始时间", example="2022-03-21 09:40:25")
    private String payStart;
    @ApiCloudField(value="支付结束时间", example="2022-03-21 09:40:32")
    private String payEnd;
    @ApiCloudField(value="支付金额，单位分", example="100")
    private BigDecimal amount;
    @ApiCloudField(value="买家支付金额，单位分", example="100")
    private BigDecimal buyerPayAmount;
    @ApiCloudField(value="手续费，单位分", example="0")
    private BigDecimal fee;
    @ApiCloudField(value="渠道名称", example="0")
    private String channelName;
    @ApiCloudField(value="退款金额，单位分", example="0")
    private BigDecimal refundAmount;
    @ApiCloudField(value="第三方交易流水号", example="0")
    private String transactionNo;
    @ApiCloudField(value="外部子商户号", example="417300001")
    private String outSubId;
    @ApiCloudField(value="子商户名称", example="株洲市炎帝广场店")
    private String subAppName;
}
