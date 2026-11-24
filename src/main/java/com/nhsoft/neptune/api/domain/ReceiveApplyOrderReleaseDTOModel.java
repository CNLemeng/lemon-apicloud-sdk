package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveApplyOrderReleaseDTO模型
 * 全量释放收款冻结单金额
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveApplyOrderReleaseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务关联单号，传生成冻结单时的 order_no", example="YHD202610210001", required=true)
    private String refBillNo;
    @ApiCloudField(value="解冻类型（MANUAL：手动解冻；CANCEL：ERP作废解冻；DEADLINE：到期解冻；FINISH：预定货配货完成解冻；RECEIVABLE：发货解冻）", example="RECEIVABLE", required=true)
    private String releaseReason;
    @ApiCloudField(value="解冻原因文本", example="供应链调出完成，释放冻结金额", required=true)
    private String releaseReasonText;
    @ApiCloudField(value="解冻人姓名", example="供应链系统", required=true)
    private String userName;
}
