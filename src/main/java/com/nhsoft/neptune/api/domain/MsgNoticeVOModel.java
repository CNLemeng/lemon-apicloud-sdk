package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MsgNoticeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MsgNoticeVOModel extends ApiCloudObject {

    @ApiCloudField(value="title")
    private String title;
    @ApiCloudField(value="content")
    private String content;
    @ApiCloudField(value="need_notice_company_user_ids")
    private List<Long> needNoticeCompanyUserIds;
    @ApiCloudField(value="created_at", example="2026-05-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="updated_at", example="2026-05-01 00:00:00")
    private String updatedAt;
}
