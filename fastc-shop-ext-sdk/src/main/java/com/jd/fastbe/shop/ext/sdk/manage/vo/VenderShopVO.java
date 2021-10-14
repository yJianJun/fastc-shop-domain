package com.jd.fastbe.shop.ext.sdk.manage.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/11
 * @Title:
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class VenderShopVO extends BaseExtModel {


    private Long shopId;

    private Long venderId;

    private String shopName;

    private Integer shopStatus;

    private String logo;

    private String contact;

    private String companyName;

    private Integer cooperationStatus;

}
