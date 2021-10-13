package com.jd.fastbe.shop.ext.sdk.sayhello.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Map;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/11
 * @Title:
 *
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class VenderShopQueryVO extends BaseExtModel {

    /**
     * 商家id
     */
    private String venderId;
}
