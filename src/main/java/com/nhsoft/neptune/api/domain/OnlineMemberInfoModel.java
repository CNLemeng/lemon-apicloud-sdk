package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OnlineMemberInfo模型
 * 线上会员信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OnlineMemberInfoModel extends ApiCloudObject {

    @ApiCloudField(value="来源渠道appid", example="wx9a0ef77d5866ae87")
    private String appid;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="修改时间")
    private String updatedAt;
    @ApiCloudField(value="openid", example="oVqubuDoCCilbbsea4qnbQEI9Nk4")
    private String openid;
    @ApiCloudField(value="用户来源(公众号|小程序|微信支付|支付宝支付|导入|线下开卡|企业微信|第三方平台|支付宝小程序)", example="小程序")
    private String source;
    @ApiCloudField(value="unionid", example="")
    private String unionid;
    @ApiCloudField(value="头像", example="https://nhsoft-dev-oss-cn-hangzhou.aliyuncs.com/mercury-file/99676/test.png")
    private String avatar;
    @ApiCloudField(value="昵称", example="admin")
    private String nickname;
}
