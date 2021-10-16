package com.jd.fastc.biz.shop.manage.core.ability;

import com.jd.fastbe.framework.client.support.domain.BaseDomainAbility;
import com.jd.fastbe.framework.client.utils.DomainResultUtils;
import com.jd.fastbe.framework.model.annotation.DomainAbility;
import com.jd.fastbe.framework.model.base.DomainResult;

import com.jd.fastc.shop.ext.sdk.sayhello.SayHelloExt;
import com.jd.fastc.shop.ext.sdk.sayhello.vo.SayHelloVO;
import com.jd.fastc.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.model.base.DomainParam;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 * @since 2021/7/9 15:47
 */
@DomainAbility(parent = FastcShopManage.CODE)
public class SayHelloAbility extends BaseDomainAbility<SayHelloExt> {

    /**
     * 你好领域能力
     *
     * @param param 参数
     * @return 结果
     */
    public String sayHello(DomainParam<SayHelloVO> param) {
        DomainResult<String> resp = getExt().sayHello(param);
        DomainResultUtils.check(resp);
        return resp.getData();
    }

    @Override
    protected SayHelloExt getDefault() {
        return new SayHelloExt() {
            @Override
            public DomainResult<String> sayHello(DomainParam<SayHelloVO> vo) {
                return DomainResult.success("hello");
            }
        };
    }
}
