package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierBankAccountUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierBankAccountUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="开户银行")
    private String supplierBank;
    @ApiCloudField(value="银行账号")
    private String supplierBankAccount;
    @ApiCloudField(value="开户名")
    private String supplierBankAccountName;
    @ApiCloudField(value="是否默认", example="false")
    private Boolean supplierBankDefaultFlag;
    @ApiCloudField(value="银行联行号")
    private String supplierBankAccountRef;
}
