package com.catalina.infectious.common;

/**
 * 标准返回对象
 * @param <T>
 *     {"code":200,"msg":"","data":xxxxx}
 */
public class ResultCommon<T> {
    //200
    private int code;
    //
    private String msg;
    //数据
    private T data;

    private ResultCommon(){}
    private ResultCommon(int code,String msg){
        this.msg = msg;
        this.code =code;
    }
    private ResultCommon(int code,String msg,T data){
        this(code,msg);
        this.data = data;
    }

    /**
     * 成功携带信息
     * @return
     */
    public static ResultCommon success(ResultCode resultCode){
        ResultCommon objectResultCommon = new ResultCommon<>(resultCode.getCode(), resultCode.getMsg());
        return objectResultCommon;
    }
    public static ResultCommon success(){
        return success(ResultCode.LOGIN_SUCCESS);
    }
    public static <T>ResultCommon<T> success(ResultCode resultCode,T data){
        ResultCommon objectResultCommon = new ResultCommon<>(resultCode.getCode(), resultCode.getMsg());
        objectResultCommon.setData(data);
        return objectResultCommon;
    }

    public static ResultCommon fail(ResultCode resultCode){
        return success(resultCode);
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
