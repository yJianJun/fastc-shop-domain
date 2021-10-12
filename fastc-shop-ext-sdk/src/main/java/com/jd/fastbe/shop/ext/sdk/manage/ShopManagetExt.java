package com.jd.fastbe.shop.ext.sdk.manage;

import com.jd.fastbe.framework.model.annotation.DomainAbilityExtension;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.shop.ext.sdk.BizComponents;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderShopVO;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
@DomainAbilityExtension(parent = BizComponents.SHOP_MANAGE)
public interface ShopManagetExt {

    DomainResult<VenderShopVO> detail(DomainParam param);
}
