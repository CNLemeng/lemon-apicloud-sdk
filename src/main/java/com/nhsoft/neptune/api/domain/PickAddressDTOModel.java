package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PickAddressDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PickAddressDTOModel extends ApiCloudObject {

    @ApiCloudField(value="pick_province")
    private String pickProvince;
    @ApiCloudField(value="pick_city")
    private String pickCity;
    @ApiCloudField(value="pick_district")
    private String pickDistrict;
    @ApiCloudField(value="pick_city_code")
    private String pickCityCode;
    @ApiCloudField(value="pick_district_code")
    private String pickDistrictCode;
}
