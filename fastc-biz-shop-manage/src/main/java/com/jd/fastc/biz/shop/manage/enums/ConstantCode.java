package com.jd.fastc.biz.shop.manage.enums;

/***
 * @Auther: yejianjun
 * @Date: 2021/11/10
 * @Title:
 *
 */

public enum ConstantCode {

    /**
     * Web browser on PC
     */
    PC(1),
    /**
     * 1.有货 0.无货
     */
    IN_Stock(1),

    //未合作
    Not_Cooperating(5),

    NO_Stock(0);

    private Integer code;

    ConstantCode(Integer code) {
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
