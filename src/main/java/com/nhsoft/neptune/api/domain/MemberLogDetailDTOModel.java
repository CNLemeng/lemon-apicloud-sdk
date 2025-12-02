package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberLogDetailDTO模型
 * 会员日志详情DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLogDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作时间", example="2022-04-05 10:00:00")
    private String createdAt;
    @ApiCloudField(value="会员ID", example="207200025932")
    private String customerId;
    @ApiCloudField(value="操作类型(默认为全部) BINDING,IDENTIT_CHANGE,UPDATE_INFO,DELETE,UNBIND", example="UPDATE_INFO")
    private String logType;
    @ApiCloudField(value="备注", example="[姓名:叶某ren->叶某r000]")
    private String memo;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
}
