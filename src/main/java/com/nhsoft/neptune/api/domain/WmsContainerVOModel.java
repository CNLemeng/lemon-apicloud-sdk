package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsContainerVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsContainerVOModel extends ApiCloudObject {

    @ApiCloudField(value="container_name")
    private String containerName;
    @ApiCloudField(value="container_price")
    private BigDecimal containerPrice;
    @ApiCloudField(value="container_code")
    private String containerCode;
    @ApiCloudField(value="box_code")
    private String boxCode;
    @ApiCloudField(value="box_detail_list")
    private List<WmsBoxCodeDetailVOModel> boxDetailList;
}
