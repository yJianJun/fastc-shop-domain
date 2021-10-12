package com.jd.fastbe.biz.shop.manage.controller;

import com.jd.fastbe.biz.shop.manage.FastcShopManage;
import com.jd.fastbe.biz.shop.manage.core.service.ShopManageDomainService;
import com.jd.fastbe.framework.client.domain.vo.LoginVO;
import com.jd.fastbe.framework.client.helper.LoginContextHelper;
import com.jd.fastbe.framework.client.support.rest.Result;
import com.jd.fastbe.framework.model.annotation.FunctionComponent;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.shop.ext.sdk.sayhello.vo.VenderShopVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController("/fastc/vender/shop")
public class ShopManageController {

    @Resource
    private ShopManageDomainService shopManageDomainService;

    /**
     * 查询店铺基本信息
     *
     * @param param 请求信息
     * @return
     */
    @PostMapping("/detail")
    @FunctionComponent(code = "ShopManageController#detail", parent = FastcShopManage.CODE)
    public Result<VenderShopVO> detail(@RequestBody DomainParam param) {
        LoginVO loginVO = LoginContextHelper.loadLoginInfo();
        String pin = loginVO.getPin();
        Map<String, Object> ext = param.getExt();
        ext.put("pin",pin);
        VenderShopVO venderShopVO = shopManageDomainService.detail(param);
        return Result.success(venderShopVO);
    }
}
