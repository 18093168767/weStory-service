package com.springboot.ourStory.result;

import lombok.Getter;

/**
        *功能描述:result$ result$
        *@author guyongqi
        *@date 20210927$
        */
@Getter
public enum ResultCode {

    //1000系列通用错误
    USER_LOGIN_SUCCESS(1000, "登录成功"),
    USER_REGISTER_SUCCESS(1000, "注册成功"),
    USER_REGISTER_FAIL(1000, "注册失败"),
    SUCCESS(1000, "操作成功"),
    FAILED(1001, "接口错误"),
    VALIDATE_FAILED(1002, "参数校验失败"),
    ERROR(1003, "未知错误"),

    //2000系列用户错误
    USER_NOT_EXIST(2000,"用户不存在"),
    USER_LOGIN_FAIL(2001,"用户名或密码错误"),
    USER_NOT_LOGIN(2002,"用户还未登录,请先登录"),
    NO_PERMISSION(2003,"权限不足,请联系管理员");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
