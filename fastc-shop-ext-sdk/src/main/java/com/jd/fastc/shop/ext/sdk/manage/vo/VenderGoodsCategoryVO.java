package com.jd.fastc.shop.ext.sdk.manage.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
@Data
@Accessors(chain = true)
@ApiModel("商品分类TO")
@EqualsAndHashCode(callSuper = true)
public class VenderGoodsCategoryVO extends BaseExtModel {

    @ApiModelProperty(value = "商品分类id",position = 0)
    private Long id;

    @ApiModelProperty(value = "商品分类名字",position = 1)
    private String title;
}
