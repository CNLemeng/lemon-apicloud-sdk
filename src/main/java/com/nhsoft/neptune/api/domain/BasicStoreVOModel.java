package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicStoreVO模型
 * 商城门店
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicStoreVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="1")
    private Long id;
    @ApiCloudField(value="code", example="1")
    private String code;
    @ApiCloudField(value="business_times")
    private List<BusinessTimeDTOModel> businessTimes;
    @ApiCloudField(value="business")
    private Boolean business;
    @ApiCloudField(value="address")
    private String address;
    @ApiCloudField(value="province", example="浙江省")
    private String province;
    @ApiCloudField(value="city", example="宁波市")
    private String city;
    @ApiCloudField(value="district", example="江北区")
    private String district;
    @ApiCloudField(value="closed", example="true")
    private Boolean closed;
    @ApiCloudField(value="delete_flag", example="true")
    private Boolean deleteFlag;
    @ApiCloudField(value="delivery_center", example="true")
    private Boolean deliveryCenter;
    @ApiCloudField(value="description")
    private String description;
    @ApiCloudField(value="distance", example="10.0")
    private BigDecimal distance;
    @ApiCloudField(value="enable", example="true")
    private Boolean enable;
    @ApiCloudField(value="enable_wms", example="true")
    private Boolean enableWms;
    @ApiCloudField(value="longitude", example="10.52")
    private BigDecimal longitude;
    @ApiCloudField(value="latitude", example="19.021")
    private BigDecimal latitude;
    @ApiCloudField(value="local_enable", example="true")
    private Boolean localEnable;
    @ApiCloudField(value="merchant_enable_wms", example="true")
    private Boolean merchantEnableWms;
    @ApiCloudField(value="name", example="测试门店一")
    private String name;
    @ApiCloudField(value="offline_id", example="1")
    private Integer offlineId;
    @ApiCloudField(value="phone", example="18265521876")
    private String phone;
    @ApiCloudField(value="pick_types")
    private List<String> pickTypes;
    @ApiCloudField(value="postcode")
    private String postcode;
    @ApiCloudField(value="resource_id")
    private Long resourceId;
    @ApiCloudField(value="resource_url")
    private String resourceUrl;
    @ApiCloudField(value="show_name")
    private String showName;
    @ApiCloudField(value="param")
    private BasicStoreParamDTOModel param;
}
