package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutShareOrderFullyVO模型
 * 费用分摊单完整信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutShareOrderFullyVOModel extends ApiCloudObject {

    @ApiCloudField(value="share_order_fid", example="OS992608270001")
    private String shareOrderFid;
    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="storehouse_num", example="1")
    private Integer storehouseNum;
    @ApiCloudField(value="creator", example="开放平台接口")
    private String creator;
    @ApiCloudField(value="auditor", example="开放平台接口")
    private String auditor;
    @ApiCloudField(value="create_time", example="2026-08-27 10:00:00")
    private String createTime;
    @ApiCloudField(value="audit_time", example="2026-08-27 10:00:00")
    private String auditTime;
    @ApiCloudField(value="share_money", example="100.0")
    private BigDecimal shareMoney;
    @ApiCloudField(value="share_rule", example="按金额")
    private String shareRule;
    @ApiCloudField(value="share_order_type", example="收货单")
    private String shareOrderType;
    @ApiCloudField(value="share_order_inout_type", example="供应商费用单")
    private String shareOrderInoutType;
    @ApiCloudField(value="state_code")
    private String stateCode;
    @ApiCloudField(value="state_name")
    private String stateName;
    @ApiCloudField(value="details")
    private List<OtherInoutShareOrderDetailVOModel> details;
    @ApiCloudField(value="other_inouts")
    private List<OtherInoutVOModel> otherInouts;
}
