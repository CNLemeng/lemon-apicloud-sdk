package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsDockOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsDockOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="wms_dock_order_detail_num", example="1")
    private Integer wmsDockOrderDetailNum;
    @ApiCloudField(value="warehouse_book_order_fid", example="RD996589926133000001")
    private String warehouseBookOrderFid;
    @ApiCloudField(value="supplier_appoint_task_fid")
    private String supplierAppointTaskFid;
    @ApiCloudField(value="item_num", example="1")
    private Integer itemNum;
    @ApiCloudField(value="item_name", example="001")
    private String itemName;
    @ApiCloudField(value="item_code", example="1500000069")
    private String itemCode;
    @ApiCloudField(value="item_spec", example="1箱*4件数")
    private String itemSpec;
    @ApiCloudField(value="item_barcode", example="132456463160000064")
    private String itemBarcode;
    @ApiCloudField(value="item_base_unit", example="公斤")
    private String itemBaseUnit;
    @ApiCloudField(value="item_use_unit", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="base_qty", example="2.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="use_qty", example="2.0")
    private BigDecimal useQty;
    @ApiCloudField(value="present_use_unit", example="公斤")
    private String presentUseUnit;
    @ApiCloudField(value="present_base_unit", example="公斤")
    private String presentBaseUnit;
    @ApiCloudField(value="present_base_qty", example="2.0")
    private BigDecimal presentBaseQty;
    @ApiCloudField(value="present_use_qty", example="2.0")
    private BigDecimal presentUseQty;
}
