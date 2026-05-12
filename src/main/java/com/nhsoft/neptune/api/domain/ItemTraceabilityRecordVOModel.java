package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityRecordVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityRecordVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_traceability_record_id")
    private String itemTraceabilityRecordId;
    @ApiCloudField(value="item_traceability_id")
    private String itemTraceabilityId;
    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
    @ApiCloudField(value="user_name")
    private String userName;
    @ApiCloudField(value="query_time")
    private String queryTime;
    @ApiCloudField(value="user_ip")
    private String userIp;
    @ApiCloudField(value="ip_location")
    private String ipLocation;
    @ApiCloudField(value="user_phone")
    private String userPhone;
}
