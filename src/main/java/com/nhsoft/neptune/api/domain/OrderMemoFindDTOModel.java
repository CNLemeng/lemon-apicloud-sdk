package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderMemoFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderMemoFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_memo_bill_nos", required=true)
    private List<String> orderMemoBillNos;
}
