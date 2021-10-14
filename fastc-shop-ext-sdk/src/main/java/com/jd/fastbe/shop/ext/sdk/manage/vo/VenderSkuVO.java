package com.jd.fastbe.shop.ext.sdk.manage.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
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
public class VenderSkuVO extends BaseExtModel {

    private String skuId;

    private String skuImageUrl;

    private String skuName;

    private Boolean skuStock;

    private String skuPrice;
}
