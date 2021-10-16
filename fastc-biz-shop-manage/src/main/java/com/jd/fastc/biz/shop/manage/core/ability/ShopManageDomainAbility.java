package com.jd.fastc.biz.shop.manage.core.ability;

import com.jd.fastc.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.client.support.domain.BaseDomainAbility;
import com.jd.fastbe.framework.client.support.exception.DefaultErrorCodeEnum;
import com.jd.fastbe.framework.client.utils.DomainResultUtils;
import com.jd.fastbe.framework.model.annotation.DomainAbility;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastc.shop.ext.sdk.manage.ShopManagetExt;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderShopVO;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
@DomainAbility(parent = FastcShopManage.CODE)
public class ShopManageDomainAbility extends BaseDomainAbility<ShopManagetExt> {


    @Override
    protected ShopManagetExt getDefault() {
        return param -> DomainResult.fail(DefaultErrorCodeEnum.EXT_INVOKE_ERROR.getCode(), DefaultErrorCodeEnum.EXT_INVOKE_ERROR.getMessage());
    }

    public DomainResult<VenderShopVO> detail(DomainParam param) {
        DomainResult<VenderShopVO> result = getExt().detail(param);
        DomainResultUtils.check(result);
        return result;
    }
}
