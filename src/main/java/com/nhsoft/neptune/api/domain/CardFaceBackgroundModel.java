package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardFaceBackground模型
 * 卡面背景
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardFaceBackgroundModel extends ApiCloudObject {

    @ApiCloudField(value="背景图片 URL", required=true)
    private String url;
}
