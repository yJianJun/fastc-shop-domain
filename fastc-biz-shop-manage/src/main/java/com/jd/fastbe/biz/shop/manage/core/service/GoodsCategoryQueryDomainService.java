package com.jd.fastbe.biz.shop.manage.core.service;

import com.jd.fastbe.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainService;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderGoodsCategoryVO;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderShopVO;

import java.util.List;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
public interface GoodsCategoryQueryDomainService {

    /**
     * 查询店铺内分类列表
     *
     * @param param 入参
     * @return 服务单列表
     */
    @DomainService(parent = FastcShopManage.CODE)
    List<VenderGoodsCategoryVO> getList(DomainParam param);
}
