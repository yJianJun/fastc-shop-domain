package com.jd.fastc.shop.ext.sdk.manage.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/13
 * @Title:
 *
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "商品Sku信息TO")
public class VenderSkuVO extends BaseExtModel {

    @ApiModelProperty(value = "商品sku id", position = 0)
    private String skuId;

    @ApiModelProperty(value = "商品sku图片地址", position = 1)
    private String skuImageUrl;

    @ApiModelProperty(value = "商品sku名字", position = 2)
    private String skuName;

    @ApiModelProperty(value = "商品sku库存状态：true-有货 false-无货", position = 3,allowableValues = "true,false")
    private Boolean skuStock;

    @ApiModelProperty(value = "商品sku价格", position = 4)
    private String skuPrice;
}
