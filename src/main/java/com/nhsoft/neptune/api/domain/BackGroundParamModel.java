package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BackGroundParam模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BackGroundParamModel extends ApiCloudObject {

    @ApiCloudField(value="type")
    private String type;
    @ApiCloudField(value="color")
    private String color;
    @ApiCloudField(value="back_ground_color")
    private String backGroundColor;
    @ApiCloudField(value="img_url")
    private String imgUrl;
    @ApiCloudField(value="back_ground_img_url")
    private String backGroundImgUrl;
    @ApiCloudField(value="text_color")
    private String textColor;
}
