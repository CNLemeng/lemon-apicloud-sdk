package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosBookVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosBookVOModel extends ApiCloudObject {

    @ApiCloudField(value="销售预订单编号", example="Y9965801261532080004")
    private String bookId;
    @ApiCloudField(value="销售单号", example="9965801261532080004")
    private String orderNo;
    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="营业日", example="20260602")
    private String shiftTableBizday;
    @ApiCloudField(value="提货方式", example="DELIVERY")
    private String pickType;
    @ApiCloudField(value="状态", example="SHIPPED")
    private String state;
    @ApiCloudField(value="购买人名称", example="wse")
    private String buyerName;
    @ApiCloudField(value="购买人手机号", example="176442196980")
    private String buyerPhone;
    @ApiCloudField(value="收货人名称", example="wse")
    private String pickerName;
    @ApiCloudField(value="收货人手机号", example="176442196980")
    private String pickerPhone;
    @ApiCloudField(value="取货时间/发货时间")
    private String pickDate;
    @ApiCloudField(value="取货地址", example="浙江省宁波市江北区")
    private String pickAddress;
    @ApiCloudField(value="备注", example="ces1")
    private String memo;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="制单人", example="ces1")
    private String createdByName;
    @ApiCloudField(value="完成时间")
    private String shippedAt;
    @ApiCloudField(value="发货人", example="ces1")
    private String shippedByName;
    @ApiCloudField(value="要货单号", example="YH996750000001")
    private String requestOrderFid;
    @ApiCloudField(value="取餐号 账套号-门店-当天 唯一", example="004")
    private String pickUpNo;
    @ApiCloudField(value="预订单类型", example="PREPAID")
    private String bookType;
    @ApiCloudField(value="单据总额", example="0.0")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="优惠合计", example="0.0")
    private BigDecimal discountTotalMoney;
    @ApiCloudField(value="应收合计", example="0.0")
    private BigDecimal receiveTotalMoney;
}
