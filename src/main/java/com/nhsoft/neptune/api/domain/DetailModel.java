package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * Detail模型
 * WMS批发销售单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DetailModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="10001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="佰优五香花生130g")
    private String orderDetailItemName;
    @ApiCloudField(value="基本数量", example="5", required=true)
    private BigDecimal orderDetailQty;
    @ApiCloudField(value="赠品基本数量", example="0")
    private BigDecimal orderDetailPresentQty;
    @ApiCloudField(value="生产日期，格式：yyyy-MM-dd HH:mm:ss")
    private String orderDetailProductingDate;
    @ApiCloudField(value="批次号", example="20261007")
    private String orderDetailLotNumber;
    @ApiCloudField(value="常用单位", example="包", required=true)
    private String orderDetailUseUnit;
    @ApiCloudField(value="常用数量", example="5", required=true)
    private BigDecimal orderDetailUseQty;
    @ApiCloudField(value="换算率", example="1", required=true)
    private BigDecimal orderDetailUseRate;
    @ApiCloudField(value="赠品单位", example="包")
    private String orderDetailPresentUnit;
    @ApiCloudField(value="赠品常用数量", example="0")
    private BigDecimal orderDetailPresentUseQty;
    @ApiCloudField(value="基本价格；老批发按此价格，新批发未传会员时按订单或最新价格重新设值", example="4.1")
    private BigDecimal orderDetailPrice;
    @ApiCloudField(value="规格编号；新批发按传入编号匹配，未传时按常用单位匹配", example="100124531")
    private Long itemSpecNum;
}
