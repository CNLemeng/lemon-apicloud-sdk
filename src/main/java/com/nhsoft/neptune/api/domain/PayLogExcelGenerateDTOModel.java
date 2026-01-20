package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayLogExcelGenerateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayLogExcelGenerateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="生成文件的日期", example="2025-04-01", required=true)
    private String date;
}
