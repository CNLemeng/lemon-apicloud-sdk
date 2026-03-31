package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderOutBillNoFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderOutBillNoFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="外部单号", example="A202603010000001", required=true)
    private String outOrderOutBillNo;
}
