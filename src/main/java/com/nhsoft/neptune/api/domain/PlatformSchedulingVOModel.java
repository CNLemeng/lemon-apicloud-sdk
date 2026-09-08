package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PlatformSchedulingVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PlatformSchedulingVOModel extends ApiCloudObject {

    @ApiCloudField(value="wms_dock_order_fid", example="YD996589926175000002")
    private String wmsDockOrderFid;
    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="state_code", example="1")
    private Integer stateCode;
    @ApiCloudField(value="state_name", example="制单")
    private String stateName;
    @ApiCloudField(value="create_time", example="2026-06-01 00:00:00")
    private String createTime;
    @ApiCloudField(value="update_time", example="2026-06-01 00:00:00")
    private String updateTime;
    @ApiCloudField(value="creator")
    private String creator;
    @ApiCloudField(value="updater")
    private String updater;
    @ApiCloudField(value="supplier_num", example="996580163")
    private Integer supplierNum;
    @ApiCloudField(value="supplier_name", example="测试升级")
    private String supplierName;
    @ApiCloudField(value="plan_enter_time", example="2026-06-01 00:00:00")
    private String planEnterTime;
    @ApiCloudField(value="real_enter_time", example="2026-06-01 00:00:00")
    private String realEnterTime;
    @ApiCloudField(value="real_out_time", example="2026-06-01 00:00:00")
    private String realOutTime;
    @ApiCloudField(value="enter_state", example="未入场")
    private String enterState;
    @ApiCloudField(value="car_no")
    private String carNo;
    @ApiCloudField(value="car_driver", example="admin")
    private String carDriver;
    @ApiCloudField(value="car_driver_phone", example="1895522111001")
    private String carDriverPhone;
    @ApiCloudField(value="dock_num", example="335")
    private Integer dockNum;
    @ApiCloudField(value="dock_name", example="月台二号")
    private String dockName;
    @ApiCloudField(value="receive_user_num")
    private Integer receiveUserNum;
    @ApiCloudField(value="receive_user_name")
    private String receiveUserName;
    @ApiCloudField(value="receive_user_phone")
    private String receiveUserPhone;
    @ApiCloudField(value="memo")
    private String memo;
    @ApiCloudField(value="unloading_type")
    private String unloadingType;
    @ApiCloudField(value="short_order_fid")
    private String shortOrderFid;
    @ApiCloudField(value="queue_num")
    private Integer queueNum;
    @ApiCloudField(value="need_queue_num")
    private Boolean needQueueNum;
    @ApiCloudField(value="remain_queue_count")
    private Integer remainQueueCount;
    @ApiCloudField(value="wms_dock_order_detail_list")
    private List<WmsDockOrderDetailVOModel> wmsDockOrderDetailList;
}
