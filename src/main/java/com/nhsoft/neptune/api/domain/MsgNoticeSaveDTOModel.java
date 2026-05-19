package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MsgNoticeSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MsgNoticeSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="title", required=true)
    private String title;
    @ApiCloudField(value="content", required=true)
    private String content;
    @ApiCloudField(value="need_notice_company_user_ids", required=true)
    private List<Long> needNoticeCompanyUserIds;
}
