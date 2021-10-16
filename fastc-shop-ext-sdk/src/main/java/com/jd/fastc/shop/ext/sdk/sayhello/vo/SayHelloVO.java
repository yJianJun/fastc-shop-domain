package com.jd.fastc.shop.ext.sdk.sayhello.vo;

import com.jd.fastbe.framework.model.base.BaseExtModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 * @since 2021/7/9 15:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SayHelloVO extends BaseExtModel {

    private String hello;

}
