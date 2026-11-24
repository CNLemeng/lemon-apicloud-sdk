package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardBatchCreateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardBatchCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="card_type_id", example="27", required=true)
    private Long cardTypeId;
    @ApiCloudField(value="card_face_background")
    private String cardFaceBackground;
    @ApiCloudField(value="client_name")
    private String clientName;
    @ApiCloudField(value="client_contact")
    private String clientContact;
    @ApiCloudField(value="total_money", example="950", required=true)
    private BigDecimal totalMoney;
    @ApiCloudField(value="memo", example="测试发卡")
    private String memo;
    @ApiCloudField(value="issue_card_num", example="10", required=true)
    private Integer issueCardNum;
    @ApiCloudField(value="sell_price", example="95", required=true)
    private BigDecimal sellPrice;
    @ApiCloudField(value="expire_time", example="2026-11-03 00:00:00")
    private String expireTime;
    @ApiCloudField(value="fixed_password", example="123456")
    private String fixedPassword;
    @ApiCloudField(value="branch_id")
    private Integer branchId;
}
