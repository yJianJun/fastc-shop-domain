package com.jd.fastc.biz.shop.manage.core.service;

import com.jd.fastc.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainService;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderShopVO;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/11
 * @Title:
 *
 */

public interface ShopManageDomainService {

    /**
     * 查询店铺基本信息
     */
    @DomainService(parent = FastcShopManage.CODE)
    VenderShopVO detail(String venderId,String pin);
}
