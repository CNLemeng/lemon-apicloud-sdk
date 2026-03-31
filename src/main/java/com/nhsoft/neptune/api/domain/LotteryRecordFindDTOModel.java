package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * LotteryRecordFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LotteryRecordFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为1000)", example="1000", required=true)
    private Integer pageSize;
    @ApiCloudField(value="抽奖活动id", required=true)
    private Long actionId;
}
