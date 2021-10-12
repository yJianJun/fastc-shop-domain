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
@EqualsAndHashCode(callSuper = true)
public class VenderShopQueryVO extends BaseExtModel {

    /**
     * 商家id
     */
    private String venderId;

    /**
     * 数据扩展
     */
    private Map<String,String> ext;
}
