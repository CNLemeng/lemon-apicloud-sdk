package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicStoreParamDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicStoreParamDTOModel extends ApiCloudObject {

    @ApiCloudField(value="package_fee_settings")
    private PackageFeeSettingsModel packageFeeSettings;
    @ApiCloudField(value="alipay_shopid")
    private String alipayShopid;
    @ApiCloudField(value="alipay_storeid")
    private String alipayStoreid;
    @ApiCloudField(value="auto_call", example="true")
    private Boolean autoCall;
    @ApiCloudField(value="completing_auto_call", example="true")
    private Boolean completingAutoCall;
    @ApiCloudField(value="delivery_appointment_settings")
    private AppointmentSettingsModel deliveryAppointmentSettings;
    @ApiCloudField(value="self_pick_appointment_settings")
    private AppointmentSettingsModel selfPickAppointmentSettings;
    @ApiCloudField(value="waiting_time_after_paid", example="10")
    private Long waitingTimeAfterPaid;
    @ApiCloudField(value="isolation", example="true")
    private Boolean isolation;
    @ApiCloudField(value="self_pick_minimum_purchase_money", example="0.0")
    private BigDecimal selfPickMinimumPurchaseMoney;
    @ApiCloudField(value="time_before_per_order_received", example="10")
    private Long timeBeforePerOrderReceived;
}
