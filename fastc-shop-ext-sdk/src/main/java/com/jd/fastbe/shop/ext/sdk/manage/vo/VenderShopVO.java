package com.jd.fastbe.shop.ext.sdk.manage.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/11
 * @Title:
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "店铺基本信息TO")
public class VenderShopVO extends BaseExtModel {

    @ApiModelProperty(value = "店铺id", position = 0)
    private String shopId;

    @ApiModelProperty(value = "商家id",position = 1)
    private String venderId;

    @ApiModelProperty(value = "店铺名字",position = 2)
    private String shopName;

    @ApiModelProperty(value = "店铺状态：1-停用 2-启用 3-待启用",position = 3,allowableValues = "1,2,3")
    private Integer shopStatus;

    @ApiModelProperty(value = "店铺LOGO",position = 4)
    private String logo;

    @ApiModelProperty(value = "联系电话",position = 5)
    private String contact;

    @ApiModelProperty(value = "商家公司名称",position = 6)
    private String companyName;

    @ApiModelProperty(value = "合作状态：1-待审，2-通过，3-否决",position = 7,allowableValues = "1,2,3")
    private Integer cooperationStatus;

}
