package com.springboot.ourStory.exception;

import com.springboot.ourStory.result.ResultCode;
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
