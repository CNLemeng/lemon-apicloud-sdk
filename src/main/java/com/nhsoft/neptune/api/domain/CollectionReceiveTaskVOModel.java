package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CollectionReceiveTaskVO模型
 * 采配收货任务
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CollectionReceiveTaskVOModel extends ApiCloudObject {

    @ApiCloudField(value="收货任务单号", example="996589926090100001")
    private String receiveTaskFid;
    @ApiCloudField(value="采购任务单号", example="996589926090100001")
    private String purchaseTaskFid;
    @ApiCloudField(value="账套编码", example="99658")
    private String systemBookCode;
    @ApiCloudField(value="收货门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="采配日", example="20260901")
    private String receiveTaskWmsBizday;
    @ApiCloudField(value="收货任务创建时间", example="2026-09-01 09:30:00")
    private String receiveTaskCreateTime;
    @ApiCloudField(value="收货任务创建人", example="admin")
    private String receiveTaskCreator;
    @ApiCloudField(value="收货人姓名", example="张三")
    private String receiveTaskUserName;
    @ApiCloudField(value="收货人编号", example="990001")
    private Integer receiveTaskUserNum;
    @ApiCloudField(value="商品系统编号", example="1001")
    private Integer receiveTaskItemNum;
    @ApiCloudField(value="商品代码", example="SP001")
    private String receiveTaskItemCode;
    @ApiCloudField(value="商品名称", example="苹果")
    private String receiveTaskItemName;
    @ApiCloudField(value="商品规格", example="5kg/箱")
    private String receiveTaskItemSpec;
    @ApiCloudField(value="商品部门", example="生鲜部")
    private String receiveTaskItemDepartment;
    @ApiCloudField(value="商品成本核算方式", example="加权平均法")
    private String receiveTaskItemCostMode;
    @ApiCloudField(value="商品类别代码", example="0101")
    private String receiveTaskItemCategoryCode;
    @ApiCloudField(value="商品类别名称", example="水果")
    private String receiveTaskItemCategoryName;
    @ApiCloudField(value="商品常用单位", example="箱")
    private String receiveTaskItemUseUnit;
    @ApiCloudField(value="商品基本单位", example="公斤")
    private String receiveTaskItemBaseUnit;
    @ApiCloudField(value="计划收货常用数量", example="10.0")
    private BigDecimal receiveTaskItemPlanUseQty;
    @ApiCloudField(value="实际收货常用数量", example="9.5")
    private BigDecimal receiveTaskItemRealUseQty;
    @ApiCloudField(value="计划收货基本数量", example="50.0")
    private BigDecimal receiveTaskItemPlanBaseQty;
    @ApiCloudField(value="实际收货基本数量", example="47.5")
    private BigDecimal receiveTaskItemRealBaseQty;
    @ApiCloudField(value="常用单位换算率", example="5.0")
    private BigDecimal receiveTaskItemUseRate;
    @ApiCloudField(value="收货任务完成时间", example="2026-09-01 10:30:00")
    private String receiveTaskCompleteTime;
    @ApiCloudField(value="收货任务完成人", example="admin")
    private String receiveTaskCompleteUser;
    @ApiCloudField(value="收货任务备注", example="外包装完好")
    private String receiveTaskMemo;
    @ApiCloudField(value="商品是否定装", example="true")
    private Boolean receiveTaskItemFixedIs;
    @ApiCloudField(value="采购类型", example="自采")
    private String receiveTaskModel;
    @ApiCloudField(value="收货明细列表")
    private List<CollectionReceiveTaskDetailVOModel> wmsReceiveTaskDetailList;
    @ApiCloudField(value="wms_inventory_ln_attribute")
    private WmsInventoryLnAttributeVOModel wmsInventoryLnAttribute;
    @ApiCloudField(value="收货附件URL列表", example="[\"https://example.com/receive.jpg\"]")
    private List<String> attachmentList;
}
