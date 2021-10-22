package com.jd.fastc.biz.shop.manage.controller;

import com.jd.fastc.biz.shop.manage.FastcShopManage;
import com.jd.fastc.biz.shop.manage.core.service.GoodsCategoryQueryDomainService;
import com.jd.fastc.biz.shop.manage.core.service.GoodsQueryDomainService;
import com.jd.fastc.biz.shop.manage.core.service.ShopManageDomainService;
import com.jd.fastbe.framework.client.domain.vo.LoginVO;
import com.jd.fastbe.framework.client.helper.LoginContextHelper;
import com.jd.fastbe.framework.client.support.factory.DomainParamFactory;
import com.jd.fastbe.framework.client.support.rest.Result;
import com.jd.fastbe.framework.model.annotation.FunctionComponent;
import com.jd.fastbe.framework.model.base.DomainParam;
import com.jd.fastbe.framework.model.base.PageVO;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderGoodsCategoryVO;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderShopVO;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderSkuQueryVO;
import com.jd.fastc.shop.ext.sdk.manage.vo.VenderSkuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags="业务组件-店铺管理")
@Validated
@RequestMapping("/fastc/vender/shop")
public class ShopManageController {

    @Resource
    private ShopManageDomainService shopManageDomainService;

    @Resource
    private GoodsCategoryQueryDomainService goodsCategoryQueryDomainService;

    @Resource
    private GoodsQueryDomainService goodsQueryDomainService;

    /**
     * 查询店铺基本信息
     *
     * @param param 请求信息
     * @return
     */
    @PostMapping(value = "/detail",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ApiOperation("店铺基本信息")
    @FunctionComponent(code = "ShopManageController#detail", parent = FastcShopManage.CODE)
    public Result<VenderShopVO> detail(@Valid @ApiParam(value = "店铺查询VO", required = true)DomainParam param) {
        LoginVO loginVO = LoginContextHelper.loadLoginInfo();
        String pin = loginVO.getPin();
        param.setOperator(pin);
        VenderShopVO venderShopVO = shopManageDomainService.detail(param);
        return Result.success(venderShopVO);
    }

    /**
     * 查询店铺内商品分类
     *
     * @param param 请求信息  //todo @requestbody去掉
     * @return
     */
    @PostMapping(value = "/goods/category/list",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ApiOperation("店内商品分类列表")
    @FunctionComponent(code = "ShopManageController#getGoodsCategoryList", parent = FastcShopManage.CODE)
    public Result<List<VenderGoodsCategoryVO>> getGoodsCategoryList(@ApiParam(value = "商品分类列表查询VO", required = true)@Valid DomainParam param) {
        List<VenderGoodsCategoryVO> categoryVOS = goodsCategoryQueryDomainService.getList(param);
        return Result.success(categoryVOS);
    }

    /**
     * 按照分类分页查询店内商品列表
     *
     * @param param 请求信息
     * @return
     */
    @PostMapping(value = "/goods/page",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ApiOperation("店内商品列表")
    @FunctionComponent(code = "ShopManageController#getGoodsPage", parent = FastcShopManage.CODE)
    public Result<PageVO<VenderSkuVO>> getGoodsPage(@ApiParam(value = "商品列表查询VO", required = true) @Valid VenderSkuQueryVO param) {
        PageVO<VenderSkuVO> page = goodsQueryDomainService.getPage(DomainParamFactory.newWithLogin(param));
        return Result.success(page);
    }
}
