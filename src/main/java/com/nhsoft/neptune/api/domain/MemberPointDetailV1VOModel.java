package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberPointDetailV1VO模型
 * 会员积分明细VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberPointDetailV1VOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", example="207200000037")
    private String customerId;
    @ApiCloudField(value="积分操作类型", example="POINT_ONLINE")
    private String operateType;
    @ApiCloudField(value="积分操作类型名称", example="线上消费")
    private String operateTypeName;
    @ApiCloudField(value="操作员", example="微商城消费")
    private String operator;
    @ApiCloudField(value="积分时间", example="2022-01-15 16:34:31")
    private String operateDate;
    @ApiCloudField(value="积分值（正数添加，负数减少）", example="4")
    private Integer pointValue;
    @ApiCloudField(value="关联订单号", example="S9381511495222723")
    private String refBillNo;
    @ApiCloudField(value="备注", example="拼团消费")
    private String memo;
    @ApiCloudField(value="会员姓名", example="马晓敏")
    private String customerName;
    @ApiCloudField(value="会员手机号", example="18815286522")
    private String customerPhone;
    @ApiCloudField(value="显示单号", example="9381511495222723")
    private String showBillNo;
    @ApiCloudField(value="门店名称", example="测试门店1")
    private String branchName;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
}
