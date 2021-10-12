package com.jd.fastbe.biz.shop.manage.core.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.jd.fastbe.shop.ext.sdk.sayhello.vo.SayHelloVO;
import com.jd.fastbe.biz.shop.manage.core.ability.SayHelloAbility;
import com.jd.fastbe.biz.shop.manage.core.service.SayHelloService;
import com.jd.fastbe.framework.model.base.DomainParam;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 * @since 2021/7/9 15:45
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {

    @Resource
    private SayHelloAbility sayHelloAbility;

    @Override
    public String sayHello(DomainParam<SayHelloVO> param) {
        // 1. 调用你好领域能力
        return sayHelloAbility.sayHello(param);
    }
}
