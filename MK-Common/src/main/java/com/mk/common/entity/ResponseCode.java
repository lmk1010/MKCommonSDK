package com.mk.common.entity;

public enum ResponseCode
{

    SUCCESS(200,"请求成功"),
    NEED_LOGIN(301,"请求失败！需要登陆"),
    ILLEGA_ARGUMENT(302,"请求失败！错误的参数"),
    ERROR(500,"服务器无响应");

    private final int code;
    private final String status;

    ResponseCode(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

}
