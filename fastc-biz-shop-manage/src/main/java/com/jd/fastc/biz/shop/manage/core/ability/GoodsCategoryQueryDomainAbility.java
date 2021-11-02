package com.jd.fastc.biz.shop.manage.core.ability;

import com.google.common.collect.Lists;
import com.jd.fastc.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.client.support.domain.BaseDomainAbility;
import com.jd.fastbe.framework.client.utils.DomainResultUtils;
import com.jd.fastbe.framework.model.annotation.DomainAbility;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastc.shop.ext.sdk.manage.GoodsCategoryQueryExt;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderGoodsCategoryVO;

import java.util.List;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
@DomainAbility(parent = FastcShopManage.CODE)
public class GoodsCategoryQueryDomainAbility extends BaseDomainAbility<GoodsCategoryQueryExt> {


    public DomainResult<List<VenderGoodsCategoryVO>> getList(String venderId) {

        DomainResult<List<VenderGoodsCategoryVO>> result = getExt().getList(venderId);
        DomainResultUtils.check(result);
        return result;
    }

    @Override
    protected GoodsCategoryQueryExt getDefault() {
        return param -> {
            return DomainResult.success(Lists.newArrayList());
        };
    }
}
