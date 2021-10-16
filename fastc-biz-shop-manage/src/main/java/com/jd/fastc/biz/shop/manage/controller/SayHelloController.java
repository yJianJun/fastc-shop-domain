package com.jd.fastc.biz.shop.manage.controller;

import com.jd.fastbe.framework.client.support.rest.Result;
import com.jd.fastbe.framework.model.annotation.FunctionComponent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jd.fastc.biz.shop.manage.converter.SayHelloConverter;
import com.jd.fastc.biz.shop.manage.dto.SayHelloDTO;
import com.jd.fastc.biz.shop.manage.core.service.SayHelloService;
import com.jd.fastbe.framework.client.support.factory.DomainParamFactory;

import javax.annotation.Resource;

import com.jd.fastc.shop.ext.sdk.sayhello.vo.SayHelloVO;
import com.jd.fastc.biz.shop.manage.FastcShopManage;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 * @since 2021/7/9 15:45
 */
@RestController
@ApiIgnore
public class SayHelloController {

    @Resource
    private SayHelloService sayHelloService;
    @Resource
    private SayHelloConverter sayHelloConverter;

    @PostMapping("/hello")
    @FunctionComponent(code = "SayHelloController#sayHello", parent = FastcShopManage.CODE)
    public Result<String> sayHello(@RequestBody SayHelloDTO dto) {
        SayHelloVO vo = sayHelloConverter.convert(dto);
        String resp = sayHelloService.sayHello(DomainParamFactory.newWithLogin(vo));
        return Result.success(resp);
    }
}
