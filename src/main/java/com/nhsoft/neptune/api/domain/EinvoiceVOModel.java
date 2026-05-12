package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * EinvoiceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EinvoiceVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="EINV9965820260225000004")
    private String id;
    @ApiCloudField(value="seller_external_partner_id", example="1")
    private String sellerExternalPartnerId;
    @ApiCloudField(value="seller_organization_id", example="ZZ00996580000004")
    private String sellerOrganizationId;
    @ApiCloudField(value="einvoice_business_merchant_id", example="1")
    private String einvoiceBusinessMerchantId;
    @ApiCloudField(value="einvoice_business_merchant_name", example="浙江乐檬信息技术有限公司")
    private String einvoiceBusinessMerchantName;
    @ApiCloudField(value="buyer_external_partner_id", example="72709")
    private String buyerExternalPartnerId;
    @ApiCloudField(value="buyer_organization_id", example="ZZ00996580000005")
    private String buyerOrganizationId;
    @ApiCloudField(value="seller_external_partner_type", example="BRANCH")
    private String sellerExternalPartnerType;
    @ApiCloudField(value="buyer_external_partner_type", example="BRANCH")
    private String buyerExternalPartnerType;
    @ApiCloudField(value="seller_name", example="浙江乐檬信息技术有限公司")
    private String sellerName;
    @ApiCloudField(value="seller_tax_num", example="91310100791000005Z")
    private String sellerTaxNum;
    @ApiCloudField(value="seller_enterprise_nature", example="GENERAL")
    private String sellerEnterpriseNature;
    @ApiCloudField(value="buyer_name", example="浙江乐檬信息技术有限公司")
    private String buyerName;
    @ApiCloudField(value="buyer_tax_num", example="91310100791000005Z")
    private String buyerTaxNum;
    @ApiCloudField(value="push_way", example="PHONE")
    private String pushWay;
    @ApiCloudField(value="email")
    private String email;
    @ApiCloudField(value="phone")
    private String phone;
    @ApiCloudField(value="total_amount", example="200.0")
    private String totalAmount;
    @ApiCloudField(value="total_tax_amount", example="20.0")
    private String totalTaxAmount;
    @ApiCloudField(value="price_tax_total", example="220.0")
    private String priceTaxTotal;
    @ApiCloudField(value="record_remark")
    private String recordRemark;
    @ApiCloudField(value="einvoice_remark")
    private String einvoiceRemark;
    @ApiCloudField(value="channel_type", example="NUONUO")
    private String channelType;
    @ApiCloudField(value="einvoice_category", example="NORMAL")
    private String einvoiceCategory;
    @ApiCloudField(value="invoice_direction", example="PURCHASE_IN")
    private String invoiceDirection;
    @ApiCloudField(value="invoice_color_type", example="BLUE")
    private String invoiceColorType;
    @ApiCloudField(value="status", example="ISSUED")
    private String status;
    @ApiCloudField(value="source", example="SYSTEM_GENERATED")
    private String source;
    @ApiCloudField(value="create_time")
    private String createTime;
    @ApiCloudField(value="einvoice_date")
    private String einvoiceDate;
    @ApiCloudField(value="einvoice_code", example="EINV9965820260225000004")
    private String einvoiceCode;
    @ApiCloudField(value="einvoice_num", example="20882602251557201844")
    private String einvoiceNum;
    @ApiCloudField(value="einvoice_record_order_no", example="EINVR9965820260225000003")
    private String einvoiceRecordOrderNo;
    @ApiCloudField(value="original_einvoice_id")
    private String originalEinvoiceId;
    @ApiCloudField(value="einvoice_url")
    private String einvoiceUrl;
}
