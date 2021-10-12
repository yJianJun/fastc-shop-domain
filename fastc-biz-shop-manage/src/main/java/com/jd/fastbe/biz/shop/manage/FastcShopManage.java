package com.jd.fastbe.biz.shop.manage;

import com.jd.fastbe.framework.model.annotation.BizComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 * @since 2021/7/9 15:41
 */
@Configuration
@BizComponent(FastcShopManage.CODE)
@ComponentScan(basePackageClasses = FastcShopManage.class)
public class FastcShopManage {

    /**
     * 代码
     */
    public static final String CODE = "shop.manage";
}
