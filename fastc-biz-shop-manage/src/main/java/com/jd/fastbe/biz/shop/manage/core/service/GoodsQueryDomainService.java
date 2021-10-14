package com.jd.fastbe.biz.shop.manage.core.service;

import com.jd.fastbe.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainService;
import com.jd.fastbe.framework.model.base.PageVO;
import com.jd.fastbe.shop.ext.sdk.manage.vo.VenderGoodsCategoryVO;
import com.jd.fastbe.shop.ext.sdk.manage.vo.VenderSkuQueryVO;
import com.jd.fastbe.shop.ext.sdk.manage.vo.VenderSkuVO;

import java.util.List;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/13
 * @Title:
 *
 */
public interface GoodsQueryDomainService {

    /**
     * 查询店铺内分类列表
     *
     * @param param 入参
     * @return 服务单列表
     */
    @DomainService(parent = FastcShopManage.CODE)
    PageVO<VenderSkuVO> getPage(DomainParam<VenderSkuQueryVO> param) throws Exception;
}
