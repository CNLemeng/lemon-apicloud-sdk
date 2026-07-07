package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseCenterSupplierParamVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseCenterSupplierParamVOModel extends ApiCloudObject {

    @ApiCloudField(value="auto_supplier_code", example="true")
    private Boolean autoSupplierCode;
    @ApiCloudField(value="supplier_code_length")
    private Integer supplierCodeLength;
    @ApiCloudField(value="supplier_code_prix")
    private String supplierCodePrix;
    @ApiCloudField(value="supplier_code_prix_type")
    private String supplierCodePrixType;
    @ApiCloudField(value="supplier_extend1_name")
    private String supplierExtend1Name;
    @ApiCloudField(value="supplier_extend1_type")
    private String supplierExtend1Type;
    @ApiCloudField(value="supplier_extend1_values")
    private List<String> supplierExtend1Values;
    @ApiCloudField(value="supplier_extend2_name")
    private String supplierExtend2Name;
    @ApiCloudField(value="supplier_extend2_type")
    private String supplierExtend2Type;
    @ApiCloudField(value="supplier_extend2_values")
    private List<String> supplierExtend2Values;
    @ApiCloudField(value="supplier_extend3_name")
    private String supplierExtend3Name;
    @ApiCloudField(value="supplier_extend3_type")
    private String supplierExtend3Type;
    @ApiCloudField(value="supplier_extend3_values")
    private List<String> supplierExtend3Values;
    @ApiCloudField(value="supplier_extend4_name")
    private String supplierExtend4Name;
    @ApiCloudField(value="supplier_extend4_type")
    private String supplierExtend4Type;
    @ApiCloudField(value="supplier_extend4_values")
    private List<String> supplierExtend4Values;
    @ApiCloudField(value="supplier_extend5_name")
    private String supplierExtend5Name;
    @ApiCloudField(value="supplier_extend5_type")
    private String supplierExtend5Type;
    @ApiCloudField(value="supplier_extend5_values")
    private List<String> supplierExtend5Values;
    @ApiCloudField(value="supplier_extend6_name")
    private String supplierExtend6Name;
    @ApiCloudField(value="supplier_extend6_type")
    private String supplierExtend6Type;
    @ApiCloudField(value="supplier_extend6_values")
    private List<String> supplierExtend6Values;
    @ApiCloudField(value="supplier_extend7_name")
    private String supplierExtend7Name;
    @ApiCloudField(value="supplier_extend7_type")
    private String supplierExtend7Type;
    @ApiCloudField(value="supplier_extend7_values")
    private List<String> supplierExtend7Values;
    @ApiCloudField(value="supplier_extend8_name")
    private String supplierExtend8Name;
    @ApiCloudField(value="supplier_extend8_type")
    private String supplierExtend8Type;
    @ApiCloudField(value="supplier_extend8_values")
    private List<String> supplierExtend8Values;
    @ApiCloudField(value="supplier_extend9_name")
    private String supplierExtend9Name;
    @ApiCloudField(value="supplier_extend9_type")
    private String supplierExtend9Type;
    @ApiCloudField(value="supplier_extend10_name")
    private String supplierExtend10Name;
    @ApiCloudField(value="supplier_extend10_type")
    private String supplierExtend10Type;
    @ApiCloudField(value="supplier_extend10_values")
    private List<String> supplierExtend10Values;
    @ApiCloudField(value="supplier_extend9_values")
    private List<String> supplierExtend9Values;
    @ApiCloudField(value="supplier_extend_required")
    private List<String> supplierExtendRequired;
}
