package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderTransferStateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderTransferStateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单编号列表", example="[YH9967059900001]", required=true)
    private List<String> requestOrderFids;
    @ApiCloudField(value="发货状态", example="待处理", required=true)
    private String transferState;
}
