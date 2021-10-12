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
public class VenderShopVO extends BaseExtModel {


    private Long shopId;

    private Long venderId;

    private String shopName;

    private Integer status;

    private String fullLogoUri;

    private Integer shopType;

    private String fullLogoUriExt;

    private String csNo;

    private String brief;

    /*
    店铺企业名称
     */
    private String company;

    /**
     * 店铺合作状态
     */
    private Integer cooperation;
    /**
     * 数据扩展
     */
    private Map<String,String> ext;
}
