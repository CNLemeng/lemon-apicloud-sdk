package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerLabelVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerLabelVOModel extends ApiCloudObject {

    @ApiCloudField(value="label_id", example="9965800000033")
    private Long labelId;
    @ApiCloudField(value="name", example="重要价值会员")
    private String name;
    @ApiCloudField(value="created_at")
    private String createdAt;
}
