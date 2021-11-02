package com.jd.fastc.shop.ext.sdk.manage;

import com.jd.fastbe.framework.model.annotation.DomainAbilityExtension;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastc.shop.ext.sdk.BizComponents;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderShopVO;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
@DomainAbilityExtension(parent = BizComponents.SHOP_MANAGE)
public interface ShopManagetExt {

    DomainResult<VenderShopVO> detail(String venderId,String pin);
}
