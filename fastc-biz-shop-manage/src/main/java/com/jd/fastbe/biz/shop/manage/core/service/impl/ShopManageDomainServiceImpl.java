package com.jd.fastbe.biz.shop.manage.core.service.impl;

import com.jd.fastbe.biz.shop.manage.core.ability.ShopManageDomainAbility;
import com.jd.fastbe.biz.shop.manage.core.service.ShopManageDomainService;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderShopVO;
import lombok.extern.slf4j.Slf4j;
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
    public VenderShopVO detail(DomainParam param) {
        DomainResult<VenderShopVO> domainResult = shopManageDomainAbility.detail(param);
        return domainResult.getData();
    }
}
