package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsBasicBatchSendByTemplateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsBasicBatchSendByTemplateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="batch_send_message", required=true)
    private SmsSendDetailModel batchSendMessage;
    @ApiCloudField(value="模板id", example="1", required=true)
    private Integer templateId;
    @ApiCloudField(value="操作人姓名", example="张三", required=true)
    private String operatorName;
    @ApiCloudField(value="操作人手机号", example="18888888888", required=true)
    private String operatorPhone;
    @ApiCloudField(value="发送时间(发送时间 不传就是立即发送，传了就是指定时间发送)", example="2026-01-01 00:00:00")
    private String sendTime;
    @ApiCloudField(value="发送类型(发送类型，标签还是手机号 PHONE,LABEL,ALL_VIP)", example="PHONE")
    private String sendType;
}
