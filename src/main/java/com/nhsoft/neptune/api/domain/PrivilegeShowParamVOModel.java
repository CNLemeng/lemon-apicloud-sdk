package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PrivilegeShowParamVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PrivilegeShowParamVOModel extends ApiCloudObject {

    @ApiCloudField(value="name", example="运费券")
    private String name;
    @ApiCloudField(value="title", example="运费券")
    private String title;
    @ApiCloudField(value="sub_title", example="省心配送")
    private String subTitle;
    @ApiCloudField(value="custom_icon", example="https://mercury-image.nhsoft.cn/simple/crm/fcm-yun-fei-quan.png")
    private String customIcon;
    @ApiCloudField(value="default_icon", example="https://mercury-image.nhsoft.cn/simple/crm/fcm-yun-fei-quan.png")
    private String defaultIcon;
    @ApiCloudField(value="icon_type", example="default")
    private String iconType;
    @ApiCloudField(value="memo", example="抵运费，安心配送")
    private String memo;
    @ApiCloudField(value="level_ids", example="[99658000001]")
    private List<Long> levelIds;
    @ApiCloudField(value="show_button", example="true")
    private Boolean showButton;
    @ApiCloudField(value="button_description", example="详情")
    private String buttonDescription;
    @ApiCloudField(value="appid", example="aa4100aaaaafgv")
    private String appid;
    @ApiCloudField(value="path", example="/pages/index/index")
    private String path;
}
