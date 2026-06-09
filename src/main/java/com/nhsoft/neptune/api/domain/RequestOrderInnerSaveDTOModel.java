package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderInnerSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderInnerSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="out_branch_num")
    private Integer outBranchNum;
    @ApiCloudField(value="request_order_creator")
    private String requestOrderCreator;
    @ApiCloudField(value="order_uuid")
    private String orderUuid;
    @ApiCloudField(value="request_order_source_id")
    private String requestOrderSourceId;
    @ApiCloudField(value="request_order_source_name")
    private String requestOrderSourceName;
    @ApiCloudField(value="request_order_details")
    private List<RequestOrderInnerDetailDTOModel> requestOrderDetails;
}
