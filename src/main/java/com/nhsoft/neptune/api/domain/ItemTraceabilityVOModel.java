package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_traceability_id")
    private String itemTraceabilityId;
    @ApiCloudField(value="item_traceability_code")
    private String itemTraceabilityCode;
    @ApiCloudField(value="state_code")
    private Integer stateCode;
    @ApiCloudField(value="state_name")
    private String stateName;
    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="del_flag")
    private Boolean delFlag;
    @ApiCloudField(value="box_code_flag")
    private Boolean boxCodeFlag;
    @ApiCloudField(value="relation_box_code")
    private String relationBoxCode;
    @ApiCloudField(value="relation_factory_code")
    private String relationFactoryCode;
    @ApiCloudField(value="check_code")
    private String checkCode;
    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
    @ApiCloudField(value="creator")
    private String creator;
    @ApiCloudField(value="create_time")
    private String createTime;
    @ApiCloudField(value="canceler")
    private String canceler;
    @ApiCloudField(value="cancel_time")
    private String cancelTime;
    @ApiCloudField(value="last_editor")
    private String lastEditor;
    @ApiCloudField(value="last_edit_time")
    private String lastEditTime;
    @ApiCloudField(value="item_traceability_records")
    private List<ItemTraceabilityRecordVOModel> itemTraceabilityRecords;
    @ApiCloudField(value="item_traceability_details")
    private List<ItemTraceabilityDetailVOModel> itemTraceabilityDetails;
    @ApiCloudField(value="item_code")
    private String itemCode;
    @ApiCloudField(value="item_barcode")
    private String itemBarcode;
    @ApiCloudField(value="item_name")
    private String itemName;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="url")
    private String url;
}
