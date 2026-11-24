package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * Order模型
 * WMS批发销售单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编号", example="600990001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="客户编号", example="006009999123453", required=true)
    private String clientFid;
    @ApiCloudField(value="销售日期，格式：yyyy-MM-dd HH:mm:ss", required=true)
    private String wholesaleOrderDate;
    @ApiCloudField(value="付款日期，格式：yyyy-MM-dd HH:mm:ss")
    private String wholesaleOrderPaymentDate;
    @ApiCloudField(value="销售员")
    private String wholesaleOrderSeller;
    @ApiCloudField(value="创建时间，格式：yyyy-MM-dd HH:mm:ss")
    private String wholesaleOrderCreatetime;
    @ApiCloudField(value="创建人")
    private String wholesaleOrderCreator;
    @ApiCloudField(value="备注")
    private String wholesaleOrderMemo;
    @ApiCloudField(value="wholesale_order_out_bill_no")
    private String wholesaleOrderOutBillNo;
    @ApiCloudField(value="wholesale_order_uuid")
    private String wholesaleOrderUuid;
    @ApiCloudField(value="销售单明细", required=true)
    private List<DetailModel> wholesaleOrderDetails;
    @ApiCloudField(value="关联批发订单")
    private List<BookModel> wholesaleBooks;
}
