package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsPhoneContent模型
 * 发给各个手机号的内容
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsPhoneContentModel extends ApiCloudObject {

    @ApiCloudField(value="发给单个手机号的参数，若不填写将采用主发送内容，格式参照主发送内容")
    private String params;
    @ApiCloudField(value="手机号", example="18888888888", required=true)
    private String phone;
}
