package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientAddressVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientAddressVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private String id;
    @ApiCloudField(value="client_id")
    private String clientId;
    @ApiCloudField(value="contact_name")
    private String contactName;
    @ApiCloudField(value="contact_phone")
    private String contactPhone;
    @ApiCloudField(value="province")
    private String province;
    @ApiCloudField(value="city")
    private String city;
    @ApiCloudField(value="area")
    private String area;
    @ApiCloudField(value="address_detail")
    private String addressDetail;
    @ApiCloudField(value="default_address", example="false")
    private Boolean defaultAddress;
    @ApiCloudField(value="address_id")
    private String addressId;
    @ApiCloudField(value="default_create_flag", example="false")
    private Boolean defaultCreateFlag;
}
