package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MaterialFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MaterialFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="ignore_deleted", example="true")
    private Boolean ignoreDeleted;
    @ApiCloudField(value="keyword")
    private String keyword;
    @ApiCloudField(value="last_update_time")
    private String lastUpdateTime;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="100", required=true)
    private Integer pageSize;
}
