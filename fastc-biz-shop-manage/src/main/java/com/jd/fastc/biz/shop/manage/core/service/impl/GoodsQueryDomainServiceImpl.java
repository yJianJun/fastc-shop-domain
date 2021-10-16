package com.jd.fastc.biz.shop.manage.core.service.impl;

import com.jd.fastc.biz.shop.manage.core.ability.GoodsQueryDomainAbility;
import com.jd.fastc.biz.shop.manage.core.service.GoodsQueryDomainService;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.framework.model.base.PageVO;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderSkuQueryVO;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderSkuVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/13
 * @Title:
 *
 */
@Service
public class GoodsQueryDomainServiceImpl implements GoodsQueryDomainService {


    @Resource
    private GoodsQueryDomainAbility queryDomainAbility;

    @Override
    public PageVO<VenderSkuVO> getPage(DomainParam<VenderSkuQueryVO> param) {
        DomainResult<PageVO<VenderSkuVO>> result = queryDomainAbility.getPage(param);
        return result.getData();
    }
}
