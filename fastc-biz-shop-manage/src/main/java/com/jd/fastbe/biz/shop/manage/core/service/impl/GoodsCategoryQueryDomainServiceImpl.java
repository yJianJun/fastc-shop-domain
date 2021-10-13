package com.jd.fastbe.biz.shop.manage.core.service.impl;

import com.jd.fastbe.biz.shop.manage.core.ability.GoodsCategoryQueryDomainAbility;
import com.jd.fastbe.biz.shop.manage.core.ability.ShopManageDomainAbility;
import com.jd.fastbe.biz.shop.manage.core.service.GoodsCategoryQueryDomainService;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderGoodsCategoryVO;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderShopVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
@Service
public class GoodsCategoryQueryDomainServiceImpl implements GoodsCategoryQueryDomainService {

    @Autowired
    private GoodsCategoryQueryDomainAbility categoryQueryDomainAbility;

    @Override
    public List<VenderGoodsCategoryVO> getList(DomainParam param) {
        DomainResult<List<VenderGoodsCategoryVO>> domainResult = categoryQueryDomainAbility.getList(param);
        return domainResult.getData();
    }
}
