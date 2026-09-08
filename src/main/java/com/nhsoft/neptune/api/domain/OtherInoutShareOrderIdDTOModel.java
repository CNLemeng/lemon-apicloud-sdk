package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutShareOrderIdDTO模型
 * 费用分摊单号参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutShareOrderIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="share_order_fid", example="OS992608270001", required=true)
    private String shareOrderFid;
}
