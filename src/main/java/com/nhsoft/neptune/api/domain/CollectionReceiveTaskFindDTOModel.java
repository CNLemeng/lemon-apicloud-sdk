package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CollectionReceiveTaskFindDTO模型
 * 采配收货任务查询条件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CollectionReceiveTaskFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="收货门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品系统编号列表", example="[1001,1002]")
    private List<Integer> itemNums;
    @ApiCloudField(value="时间范围对应的日期类型；按时间范围查询时必填", example="完成时间")
    private String dateType;
    @ApiCloudField(value="开始时间；与结束时间成对传入，并与采配日二选一")
    private String dateFrom;
    @ApiCloudField(value="结束时间；与开始时间成对传入，并与采配日二选一")
    private String dateTo;
    @ApiCloudField(value="采配日；与时间范围二选一", example="20260901")
    private String wmsBizday;
    @ApiCloudField(value="是否读取收货附件；true时返回attachment_list", example="true")
    private Boolean withAttachment;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="每页数量，最大200", example="100", required=true)
    private Integer pageSize;
}
