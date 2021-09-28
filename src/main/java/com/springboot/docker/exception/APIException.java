package com.springboot.docker.exception;

import com.springboot.docker.result.ResultCode;
import lombok.Getter;

/**
        *功能描述:$ $
        *@author guyongqi
        *@date 20210927$
        */

@Getter
public class APIException extends RuntimeException {

    private int code;
    private String msg;

    public APIException() {
        this(ResultCode.FAILED);
    }

    public APIException(ResultCode failed) {
        this.code=failed.getCode();
        this.msg=failed.getMsg();
    }
}
