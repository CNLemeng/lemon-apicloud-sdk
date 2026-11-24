package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderWmsSaveAndAuditReq模型
 * WMS批发销售单批量保存并审核请求
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderWmsSaveAndAuditReqModel extends ApiCloudObject {

    @ApiCloudField(value="批发销售单，支持多条一起传", required=true)
    private List<OrderModel> wholesaleOrders;
    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="任务id，可不传；同一任务id在10分钟内重复调用返回首次生成的批发销售单", example="CK600999910001")
    private String taskId;
    @ApiCloudField(value="是否审核：true审核，false仅制单", example="true", required=true)
    private Boolean audit;
    @ApiCloudField(value="开放平台标记，固定为true")
    private Boolean neptuneFlag;
}
