package com.jd.fastc.shop.ext.sdk.manage.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/***
 * @Auther: yejianjun
 * @Date: 2021/11/8
 * @Title:
 *
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "店铺基本信息查询VO")
public class VenderShopQueryVO extends BaseExtModel {

    @ApiModelProperty(value = "商家id", position = 0,required = true)
    @NotBlank(message ="商家id不能为空")
    private String venderId;

}
