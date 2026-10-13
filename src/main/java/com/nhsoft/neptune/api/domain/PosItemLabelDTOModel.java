package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLabelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLabelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="标签编号", example="207201000001")
    private Long itemLabelNum;
    @ApiCloudField(value="标签名称", example="新鲜")
    private String itemLabelName;
    @ApiCloudField(value="标签序号", example="1")
    private Integer sequence;
    @ApiCloudField(value="是否POS类别展示", example="true")
    private Boolean posType;
    @ApiCloudField(value="是否POS类别展示", example="true")
    private Boolean appType;
    @ApiCloudField(value="是否APP批发客户订货类别展示", example="true")
    private Boolean appWholesaleBookType;
    @ApiCloudField(value="是否启用POS角标", example="true")
    private Boolean posCorner;
    @ApiCloudField(value="POS角标", example="")
    private String posCornerContent;
    @ApiCloudField(value="APP商品展示", example="true")
    private Boolean appItem;
    @ApiCloudField(value="app类别展示（门店类型) 0或null为门店，1为配送中心", example="0")
    private Integer appBranchType;
    @ApiCloudField(value="APP类别展示 应用门店", example="")
    private List<Integer> branchNums;
    @ApiCloudField(value="APP类别下按商品添加顺序展示", example="false")
    private Boolean appItemSortBySerial;
}
