package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PrivilegeResourceNewV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PrivilegeResourceNewV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="权限编码")
    private Integer privilegeResourceKey;
    @ApiCloudField(value="权限名称")
    private String privilegeResourceName;
    @ApiCloudField(value="权限类别")
    private String privilegeResourceCategory;
    @ApiCloudField(value="权限内容")
    private String privilegeResourceProduct;
    @ApiCloudField(value="是否可查询")
    private Object privilegeResourceQuery;
    @ApiCloudField(value="是否可编辑")
    private Object privilegeResourceEdit;
    @ApiCloudField(value="是否可删除")
    private Object privilegeResourceDelete;
    @ApiCloudField(value="是否可审核")
    private Object privilegeResourceAudit;
    @ApiCloudField(value="是否可失效")
    private Object privilegeResourceInvalid;
    @ApiCloudField(value="是否可反审核")
    private Object privilegeResourceReAudit;
    @ApiCloudField(value="是否可打印")
    private Object privilegeResourcePrint;
    @ApiCloudField(value="是否可导出")
    private Object privilegeResourceExport;
    @ApiCloudField(value="父节点")
    private Integer privilegeResourceParentKey;
}
