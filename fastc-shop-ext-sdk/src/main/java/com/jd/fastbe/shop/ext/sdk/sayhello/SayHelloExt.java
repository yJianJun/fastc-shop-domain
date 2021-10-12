package com.jd.fastbe.shop.ext.sdk.sayhello;

import com.jd.fastbe.framework.model.annotation.DomainAbilityExtension;
import com.jd.fastbe.framework.model.base.DomainResult;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.SayHelloVO;
import com.jd.fastbe.framework.model.base.DomainParam;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 */
@DomainAbilityExtension(parent = "public.sayHello")
public interface SayHelloExt {

    /**
     * 你好
     *
     * @param vo 请求VO
     * @return 结果
     */
    DomainResult<String> sayHello(DomainParam<SayHelloVO> vo);
}
