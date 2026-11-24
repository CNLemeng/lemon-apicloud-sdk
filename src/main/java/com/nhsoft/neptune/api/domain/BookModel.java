package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * Book模型
 * 关联批发订单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BookModel extends ApiCloudObject {

    @ApiCloudField(value="批发订单号", example="WB633639970006126", required=true)
    private String wholesaleBookFid;
}
