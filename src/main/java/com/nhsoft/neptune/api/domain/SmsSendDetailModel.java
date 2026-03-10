package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsSendDetail模型
 * 群发内容
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsSendDetailModel extends ApiCloudObject {

    @ApiCloudField(value="主发送内容，若详细发送内容里面不填写动态参数，将以该参数为主，格式为map："{"phone":"18867860973","date":"2022-02-25"}",详细参数名称为申请的模板参数名称")
    private String params;
    @ApiCloudField(value="发给各个手机号的内容", required=true)
    private List<SmsPhoneContentModel> phoneContexts;
}
