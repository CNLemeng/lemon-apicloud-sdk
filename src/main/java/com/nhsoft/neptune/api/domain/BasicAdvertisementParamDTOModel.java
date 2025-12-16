package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicAdvertisementParamDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicAdvertisementParamDTOModel extends ApiCloudObject {

    @ApiCloudField(value="fill_type")
    private String fillType;
    @ApiCloudField(value="image_url")
    private String imageUrl;
    @ApiCloudField(value="jump_url")
    private String jumpUrl;
}
