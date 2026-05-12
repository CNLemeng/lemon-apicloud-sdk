package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomOpenAppFindReq模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomOpenAppFindReqModel extends ApiCloudObject {

    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
    @ApiCloudField(value="custom_app_name")
    private String customAppName;
    @ApiCloudField(value="custom_app_top_key")
    private String customAppTopKey;
    @ApiCloudField(value="custom_app_top_category")
    private String customAppTopCategory;
    @ApiCloudField(value="custom_app_type")
    private String customAppType;
    @ApiCloudField(value="app_id")
    private String appId;
}
