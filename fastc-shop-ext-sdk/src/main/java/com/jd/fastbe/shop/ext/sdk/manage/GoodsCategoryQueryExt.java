package com.jd.fastbe.shop.ext.sdk.manage;

import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderGoodsCategoryVO;

import java.util.List;

/***
 * @Auther: yejianjun
 * @Date: 2021/10/12
 * @Title:
 *
 */
public interface GoodsCategoryQueryExt {

    DomainResult<List<VenderGoodsCategoryVO>> getList(DomainParam param);
}
