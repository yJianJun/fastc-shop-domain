package com.jd.fastc.shop.ext.sdk.manage;

import com.jd.fastbe.framework.model.annotation.DomainAbilityExtension;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.framework.model.base.PageVO;
import com.jd.fastc.shop.ext.sdk.BizComponents;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderSkuQueryVO;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderSkuVO;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/13
 * @Title:
 *
 */
@DomainAbilityExtension(parent = BizComponents.SHOP_MANAGE)
public interface GoodsQueryExt {

    public DomainResult<PageVO<VenderSkuVO>> getPage(DomainParam<VenderSkuQueryVO> param);
}
