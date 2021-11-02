package com.jd.fastc.biz.shop.manage.core.service.impl;

import com.jd.fastc.biz.shop.manage.core.ability.ShopManageDomainAbility;
import com.jd.fastc.biz.shop.manage.core.service.ShopManageDomainService;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderShopVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/11
 * @Title:
 *
 */
@Service
public class ShopManageDomainServiceImpl implements ShopManageDomainService {

    @Autowired
    private ShopManageDomainAbility shopManageDomainAbility;

    @Override
    public VenderShopVO detail(String venderId,String pin) {
        DomainResult<VenderShopVO> domainResult = shopManageDomainAbility.detail(venderId,pin);
        return domainResult.getData();
    }
}
