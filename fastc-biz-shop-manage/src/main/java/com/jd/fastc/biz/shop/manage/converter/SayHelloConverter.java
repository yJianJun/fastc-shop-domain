package com.jd.fastc.biz.shop.manage.converter;

import com.jd.fastc.shop.ext.sdk.sayhello.vo.SayHelloVO;
import com.jd.fastc.biz.shop.manage.dto.SayHelloDTO;
import org.springframework.stereotype.Component;

/**
 * Created by SoulW on 2021/7/9.
 *
 * @author SoulW
 * @since 2021/7/9 15:45
 */
@Component
public class SayHelloConverter {

    /**
     * 转换
     *
     * @param dto DTO
     * @return 结果
     */
    public SayHelloVO convert(SayHelloDTO dto) {
        SayHelloVO vo = new SayHelloVO();
        vo.setHello(dto.getHello());
        vo.setExt(dto.getExt());
        return vo;
    }
}
