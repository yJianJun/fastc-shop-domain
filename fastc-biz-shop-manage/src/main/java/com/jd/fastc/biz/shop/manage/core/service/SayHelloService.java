package com.jd.fastc.biz.shop.manage.core.service;

import com.jd.fastbe.framework.model.base.DomainService;
import com.jd.fastc.shop.ext.sdk.sayhello.vo.SayHelloVO;
import com.jd.fastc.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.framework.model.base.DomainParam;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 * @since 2021/7/9 15:45
 */
public interface SayHelloService {

    /**
     * 你好领域服务
     *
     * @param param 参数
     * @return 结果
     */
    @DomainService(parent = FastcShopManage.CODE)
    String sayHello(DomainParam<SayHelloVO> param);
}
