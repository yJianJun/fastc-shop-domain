package com.jd.fastbe.shop.ext.sdk.manage.vo;


import com.jd.fastbe.framework.model.base.BasePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/13
 * @Title:
 *
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "商品列表查询VO")
public class VenderSkuQueryVO extends BasePageRequest {

    @ApiModelProperty(value = "商品分类id", position = 0,required = true)
    @NotBlank
    private String category;

    @ApiModelProperty(value = "商家id", position = 1,required = true)
    @NotBlank
    private String venderId;

}
