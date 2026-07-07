package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FileReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="oss_fid", required=true)
    private String ossFid;
}
