package com.jd.fastbe.shop.ext.sdk.manage.vo;


import com.jd.fastbe.framework.model.base.BasePageRequest;
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
public class VenderSkuQueryVO extends BasePageRequest {

    private String category;

    private String venderId;

}
