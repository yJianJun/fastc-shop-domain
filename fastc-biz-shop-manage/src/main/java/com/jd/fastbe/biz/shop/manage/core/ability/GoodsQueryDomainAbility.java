package com.jd.fastbe.biz.shop.manage.core.ability;

import com.jd.fastbe.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.biz.shop.manage.core.service.GoodsQueryDomainService;
import com.jd.fastbe.framework.client.support.domain.BaseDomainAbility;
import com.jd.fastbe.framework.client.support.exception.BusinessException;
import com.jd.fastbe.framework.client.support.exception.DefaultErrorCodeEnum;
import com.jd.fastbe.framework.client.utils.DomainResultUtils;
import com.jd.fastbe.framework.model.annotation.DomainAbility;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.framework.model.base.PageVO;
import com.jd.fastbe.shop.ext.sdk.manage.GoodsQueryExt;
import com.jd.fastbe.shop.ext.sdk.manage.vo.VenderGoodsCategoryVO;
import com.jd.fastbe.shop.ext.sdk.manage.vo.VenderShopVO;
import com.jd.fastbe.shop.ext.sdk.manage.vo.VenderSkuQueryVO;
import com.jd.fastbe.shop.ext.sdk.manage.vo.VenderSkuVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/13
 * @Title:
 *
 */
@DomainAbility(parent = FastcShopManage.CODE)
public class GoodsQueryDomainAbility extends BaseDomainAbility<GoodsQueryExt> {


    public DomainResult<PageVO<VenderSkuVO>> getPage(DomainParam<VenderSkuQueryVO> param) {
        DomainResult<PageVO<VenderSkuVO>> result = null;
        result = getExt().getPage(param);
        DomainResultUtils.check(result);
        return result;
    }

    @Override
    protected GoodsQueryExt getDefault() {
        return param -> {
            PageVO<VenderSkuVO> page = new PageVO<>();
            VenderSkuQueryVO reqVO = param.getData();
            page.setCurrentPage(reqVO.getCurrentPage());
            page.setPageSize(reqVO.getPageSize());
            page.setTotal(NumberUtils.LONG_ZERO);
            return DomainResult.success(page);
        };
    }
}
