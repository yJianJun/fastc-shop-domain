package com.jd.fastc.biz.shop.manage.common;

import com.jd.fastbe.framework.client.support.exception.BaseException;
import com.jd.fastc.biz.shop.manage.enums.ResultCode;

/**
 * Created by xqlu on 2019/3/21.
 *
 * @author xqlu
 * @description 异常基类
 * @modify
 */
public class RestultException extends BaseException {


    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected String errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public RestultException(String errorCode,String errorMsg) {
        super(errorCode,errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public RestultException(String errorCode,String errorMsg,Throwable cause) {
        super(errorCode,errorMsg,cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public RestultException(ResultCode errorInfoInterface) {
        this(errorInfoInterface.getCode(),errorInfoInterface.getMessage());
    }

    public RestultException(String errorMsg) {
        this(ResultCode.FAILED.getCode(),errorMsg);
    }


    public RestultException(ResultCode errorInfoInterface, String errorMsg) {
        this(errorInfoInterface.getCode(),errorMsg,null);
    }

    public RestultException(ResultCode errorInfoInterface, Throwable cause) {
        this(errorInfoInterface.getCode(),errorInfoInterface.getMessage(),cause);
    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
