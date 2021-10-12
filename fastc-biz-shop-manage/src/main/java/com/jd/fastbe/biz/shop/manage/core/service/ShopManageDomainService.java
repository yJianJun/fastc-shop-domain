package com.jd.fastbe.biz.shop.manage.core.service;

import com.jd.fastbe.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.client.domain.vo.LoginVO;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainService;
import com.jd.fastbe.framework.model.base.PageVO;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderShopQueryVO;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderShopVO;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/11
 * @Title:
 *
 */

public interface ShopManageDomainService {

    /**
     * 查询店铺基本信息
     *
     * @param param 入参
     * @return 服务单列表
     */
    @DomainService(parent = FastcShopManage.CODE)
    VenderShopVO detail(DomainParam param);
}
