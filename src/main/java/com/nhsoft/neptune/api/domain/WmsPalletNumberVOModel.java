package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsPalletNumberVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsPalletNumberVOModel extends ApiCloudObject {

    @ApiCloudField(value="pallet_number", example="RQ996582609170006")
    private String palletNumber;
    @ApiCloudField(value="detail_list")
    private List<WmsPalletNumberDetailVOModel> detailList;
    @ApiCloudField(value="container_list")
    private List<WmsContainerVOModel> containerList;
}
