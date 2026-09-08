package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReturnOrderDocumentStateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReturnOrderDocumentStateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="return_order_fid", example="RO2003990000002", required=true)
    private String returnOrderFid;
    @ApiCloudField(value="order_document_order_state", required=true)
    private String orderDocumentOrderState;
}
