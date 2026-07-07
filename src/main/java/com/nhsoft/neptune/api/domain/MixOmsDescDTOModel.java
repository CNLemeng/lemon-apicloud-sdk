package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsDescDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsDescDTOModel extends ApiCloudObject {

    @ApiCloudField(value="code")
    private Integer code;
    @ApiCloudField(value="str")
    private String str;
}
