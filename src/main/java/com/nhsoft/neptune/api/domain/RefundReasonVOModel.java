package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RefundReasonVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RefundReasonVOModel extends ApiCloudObject {

    @ApiCloudField(value="refund_reasons_after_shipped")
    private List<String> refundReasonsAfterShipped;
    @ApiCloudField(value="refund_reasons_before_shipped")
    private List<String> refundReasonsBeforeShipped;
}
