package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="自选套餐编号", example="996750000013", required=true)
    private String customizePackageNo;
}
