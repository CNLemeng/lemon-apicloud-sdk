package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderBatchReceiveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderBatchReceiveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_fid", required=true)
    private String orderFid;
    @ApiCloudField(value="purchase_order_date", example="2026-01-01 00:00:00")
    private String purchaseOrderDate;
    @ApiCloudField(value="app_user_num", required=true)
    private Integer appUserNum;
    @ApiCloudField(value="details")
    private List<PurchaseOrderBatchReceiveDetailReqModel> details;
}
