package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosBookReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosBookReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="book_id", example="PB99658000001", required=true)
    private String bookId;
}
