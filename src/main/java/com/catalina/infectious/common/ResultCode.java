package com.catalina.infectious.common;

public enum ResultCode {
    //ResultCode的单例对象
    LOGIN_SUCCESS(200, "Login success"),
    FAIL(9000, ""),
    NOT_FOUND(400, "Not found"),
    INTERNAL_ERROR(500, "Internal error"),
    ACCESS_DENIED(403, "Access denied");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
