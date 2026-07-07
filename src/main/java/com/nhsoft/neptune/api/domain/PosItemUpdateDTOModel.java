package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品名称", example="好丽友注心蛋黄派", required=true)
    private String itemName;
    @ApiCloudField(value="商品别称", example="coke cola")
    private String itemEnName;
    @ApiCloudField(value="商品类型(STANDARD:标准,COMBINED:组合商品,NONE_INVENTORY:非库存商品,DOC_MAKE_COMBINE:制单组合,CUSTOME_COMBINE:自定义组合商品,COMPONENT:成分商品)", example="STANDARD", required=true)
    private String itemType;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="商品代码(系统配置自动生成后,非必填)", example="000000004")
    private String itemCode;
    @ApiCloudField(value="商品条码(系统配置自动生成后,非必填)", example="2200551")
    private String itemBarcode;
    @ApiCloudField(value="经营方式（ 购销、联营、代销）", example="购销", required=true)
    private String itemMethod;
    @ApiCloudField(value="速记码", example="HLYZXDHP")
    private String storeItemPinyin;
    @ApiCloudField(value="零售单位", example="公斤", required=true)
    private String itemUnit;
    @ApiCloudField(value="商品类别名称", example="水果", required=true)
    private String itemCategory;
    @ApiCloudField(value="最低售价（小数点2位）", example="11.0")
    private BigDecimal itemMinPrice;
    @ApiCloudField(value="最高售价（小数点2位）", example="20.0")
    private BigDecimal itemMaxPrice;
    @ApiCloudField(value="商品部门", example="水果部门", required=true)
    private String itemDepartment;
    @ApiCloudField(value="是否停售", example="true")
    private Boolean itemSaleCeaseFlag;
    @ApiCloudField(value="停购标记", example="true")
    private Boolean itemStockCeaseFlag;
    @ApiCloudField(value="是否启用积分", example="true")
    private Boolean itemPointActived;
    @ApiCloudField(value="前台议价", example="true")
    private Boolean itemPosChangePriceFlag;
    @ApiCloudField(value="允许调价(1:否 2:是 3:仅总部可调)", example="1")
    private Integer itemPriceAdj;
    @ApiCloudField(value="积分值（小数点2位）", example="10.0")
    private BigDecimal itemPointValue;
    @ApiCloudField(value="品牌", example="品牌名称")
    private String itemBrand;
    @ApiCloudField(value="采购范围（ 不限、总部购配、门店采购、总订店收、自产）", example="自产")
    private String itemPurchaseScope;
    @ApiCloudField(value="联营扣率", example="0.1")
    private BigDecimal itemGrossRate;
    @ApiCloudField(value="成本核算方式（加权平均法、最后进价法、先进先出法、手工指定、中心手工指定）", example="加权平均法")
    private String itemCostMode;
    @ApiCloudField(value="有效天数", example="10")
    private Integer itemValidPeriod;
    @ApiCloudField(value="锁定辅助单位进货价", example="true")
    private Boolean itemFixAssistCostPrice;
    @ApiCloudField(value="锁定辅助单位配送价", example="true")
    private Boolean itemFixAssistTransferPrice;
    @ApiCloudField(value="锁定辅助单位批发价", example="true")
    private Boolean itemFixAssistWholesalePrice;
    @ApiCloudField(value="进货价（小数点8位）", example="10.0", required=true)
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="配送价（小数点4位）", example="20.0", required=true)
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="辅助单位", example="10.0")
    private String itemAssistUnit;
    @ApiCloudField(value="辅助单位换算率（小数点3位）", example="0.9")
    private BigDecimal itemAssistRate;
    @ApiCloudField(value="休眠标记(0正常，1休眠)", example="1")
    private Integer itemStatus;
    @ApiCloudField(value="允许前台折扣", example="true")
    private Boolean itemDiscounted;
    @ApiCloudField(value="产地", example="江苏南京")
    private String itemPlace;
    @ApiCloudField(value="过期催销天数", example="10")
    private Integer itemRemindPeriod;
    @ApiCloudField(value="仓储位置", example="南京市建邺区")
    private String itemStorePlace;
    @ApiCloudField(value="进项税（小数点2位，页面显示是带%）", example="1.0")
    private BigDecimal itemInTax;
    @ApiCloudField(value="出项税（小数点2位，页面显示是带%）", example="1.0")
    private BigDecimal itemOutTax;
    @ApiCloudField(value="商品称重标记", example="true")
    private Boolean itemWeightFlag;
    @ApiCloudField(value="商品标签", example="[水果, 品牌]")
    private List<String> itemLabelNames;
    @ApiCloudField(value="pos_item_matrix")
    private PosItemMatrixSaveVOModel posItemMatrix;
    @ApiCloudField(value="免税标记", example="true")
    private Boolean freeTaxFlag;
    @ApiCloudField(value="标准售价", example="20.0", required=true)
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="售价2", example="20.0", required=true)
    private BigDecimal itemLevel2Price;
    @ApiCloudField(value="item_level2_wholesale", example="1.0")
    private BigDecimal itemLevel2Wholesale;
    @ApiCloudField(value="item_level3_price", example="1.0")
    private BigDecimal itemLevel3Price;
    @ApiCloudField(value="item_level3_wholesale", example="1.0")
    private BigDecimal itemLevel3Wholesale;
    @ApiCloudField(value="item_level4_price", example="1.0")
    private BigDecimal itemLevel4Price;
    @ApiCloudField(value="item_level4_wholesale", example="1.0")
    private BigDecimal itemLevel4Wholesale;
    @ApiCloudField(value="采购单位", example="公斤", required=true)
    private String itemPurchaseUnit;
    @ApiCloudField(value="采购换算率（小数点3位）", example="0.9", required=true)
    private BigDecimal itemPurchaseRate;
    @ApiCloudField(value="库存单位", example="公斤", required=true)
    private String itemInventoryUnit;
    @ApiCloudField(value="商品批发价（小数点4位）", example="20.0")
    private BigDecimal itemWholesalePrice;
    @ApiCloudField(value="库存换算率（小数点3位）", example="0.9", required=true)
    private BigDecimal itemInventoryRate;
    @ApiCloudField(value="配送单位", example="公斤", required=true)
    private String itemTransferUnit;
    @ApiCloudField(value="配送换算率（小数点3位）", example="0.8", required=true)
    private BigDecimal itemTransferRate;
    @ApiCloudField(value="批发单位", example="公斤", required=true)
    private String itemWholesaleUnit;
    @ApiCloudField(value="批发换算率（小数点3位）", example="0.8", required=true)
    private BigDecimal itemWholesaleRate;
    @ApiCloudField(value="打印价签", example="true")
    private Boolean itemPriceTagFlag;
    @ApiCloudField(value="前台打印标签", example="true")
    private Boolean itemPrintLabelFlag;
    @ApiCloudField(value="动销天数", example="1")
    private Integer itemTransferDay;
    @ApiCloudField(value="注意事项", example="注意事项")
    private String itemNoteInfo;
    @ApiCloudField(value="最低批发价", example="1.0")
    private BigDecimal wholesaleMinPrice;
    @ApiCloudField(value="联营/直销扣率", example="0.1")
    private BigDecimal itemDirectRate;
    @ApiCloudField(value="商品查询模板ID", example="[1]")
    private List<Integer> itemFlagNums;
    @ApiCloudField(value="要货周期ID列表", example="[1]")
    private List<Long> requestBatchIds;
    @ApiCloudField(value="商品产地", example="北京")
    private String madeIn;
    @ApiCloudField(value="门店要货不可以超过中心库存量,无库存不允许要货", example="true")
    private Boolean noStockNoRequest;
    @ApiCloudField(value="一品多码")
    private List<PosItemBarCodeSaveVOModel> itemBars;
    @ApiCloudField(value="组合明细")
    private List<PosItemCombineItemSaveVOModel> posItemCombineItems;
    @ApiCloudField(value="规格明细")
    private List<PosItemSpecSaveVOModel> posItemSpecs;
    @ApiCloudField(value="淘汰标志", example="true")
    private Boolean eliminateFlag;
    @ApiCloudField(value="是否允许负库存销售", example="true")
    private Boolean itemSaleNoStore;
    @ApiCloudField(value="税收编码", example="1030202010000000000")
    private String itemTaxCode;
    @ApiCloudField(value="收货单需要输入生产日期", example="true")
    private Boolean itemNeedProductDate;
    @ApiCloudField(value="是否加工商品", example="false")
    private Boolean itemManufactureFlag;
    @ApiCloudField(value="配送毛利加点", example="0.1")
    private BigDecimal itemTransferGross;
    @ApiCloudField(value="是否锁定配送毛利加点", example="true")
    private Boolean itemTransferFixedGross;
    @ApiCloudField(value="锁定批发毛利比例", example="0.1")
    private BigDecimal itemWholesaleGross;
    @ApiCloudField(value="锁定批发毛利比例2", example="0.1")
    private BigDecimal itemWholesaleGross2;
    @ApiCloudField(value="锁定批发毛利比例3", example="0.1")
    private BigDecimal itemWholesaleGross3;
    @ApiCloudField(value="锁定批发毛利比例4", example="0.1")
    private BigDecimal itemWholesaleGross4;
    @ApiCloudField(value="是否锁定批发毛利加点", example="true")
    private Boolean itemWholesaleFixedGross;
    @ApiCloudField(value="是否锁定批发毛利2", example="true")
    private Boolean itemWholesaleFixedGross2;
    @ApiCloudField(value="是否锁定批发毛利3", example="true")
    private Boolean itemWholesaleFixedGross3;
    @ApiCloudField(value="是否锁定批发毛利4", example="true")
    private Boolean itemWholesaleFixedGross4;
    @ApiCloudField(value="锁定配送毛利加点类型（1-按比例，2-按金额）", example="1")
    private Integer itemTransferFixType;
    @ApiCloudField(value="锁定批发毛利加点类型（1-按比例，2-按金额）", example="1")
    private Integer itemWholesaleFixType;
    @ApiCloudField(value="锁定批发价2毛利加点类型（1-按比例，2-按金额）", example="1")
    private Integer itemWholesaleFixType2;
    @ApiCloudField(value="锁定批发价3毛利加点类型（1-按比例，2-按金额）", example="1")
    private Integer itemWholesaleFixType3;
    @ApiCloudField(value="锁定批发价4毛利加点类型（1-按比例，2-按金额）", example="1")
    private Integer itemWholesaleFixType4;
    @ApiCloudField(value="pos_item_commission")
    private PosItemCommissionSaveVOModel posItemCommission;
    @ApiCloudField(value="允许门店退货", example="false")
    private Boolean itemTransferReturnFlag;
    @ApiCloudField(value="经营范围编号列表", example="[1]")
    private List<Long> businessScopeList;
    @ApiCloudField(value="是否允许批发订货超中心库存", example="true")
    private Boolean wholesaleBookAllowOverCenterStock;
    @ApiCloudField(value="item_package_actived", example="true")
    private Boolean itemPackageActived;
    @ApiCloudField(value="商品描述(富文本)")
    private String description;
    @ApiCloudField(value="商品编号", example="102200551", required=true)
    private Integer itemNum;
}
