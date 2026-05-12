package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomOpenAppDeleteReq模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomOpenAppDeleteReqModel extends ApiCloudObject {

    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
    @ApiCloudField(value="custom_app_name")
    private String customAppName;
}
