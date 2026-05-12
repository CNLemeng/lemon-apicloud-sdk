package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomOpenAppDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomOpenAppDTOModel extends ApiCloudObject {

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
    @ApiCloudField(value="custom_app_url")
    private String customAppUrl;
    @ApiCloudField(value="custom_app_pic")
    private String customAppPic;
    @ApiCloudField(value="custom_app_authority")
    private String customAppAuthority;
}
